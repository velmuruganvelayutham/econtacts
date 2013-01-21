package org.thymeleaf.econtacts.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.econtacts.web.domain.Contact;
import org.thymeleaf.econtacts.web.domain.User;
import org.thymeleaf.econtacts.web.service.ContactService;
import org.thymeleaf.econtacts.web.service.UserService;

import javax.servlet.http.HttpSession;

@Controller
public class ContactController {

	@Autowired
	ContactService contactService;
	@Autowired
	UserService userService;

	@RequestMapping({ "/home/addContact" })
	public String showContactPage(Model model) {
		model.addAttribute("templateName", "/addContact");

		return "home";
	}

	@RequestMapping({ "/home/addContact/add" })
	public String addContact(@ModelAttribute Contact contact, Model model,
			HttpSession session) {
		System.out.println("UserName" + session.getAttribute("userId"));
		User user = (User) session.getAttribute("userId");
		contact.setUser(user);
		user.getContact().add(contact);
		userService.save(user);
		contactService.save(contact);
		model.addAttribute("templateName", "/table");
		return "home";
	}

	@RequestMapping({ "/home/table" })
	public String showTablePage(Model model) {

		model.addAttribute("allContacts", contactService.findAll());
		model.addAttribute("templateName", "/table");
		return "home";
	}
}
