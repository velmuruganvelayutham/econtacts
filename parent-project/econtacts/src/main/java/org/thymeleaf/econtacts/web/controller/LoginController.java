package org.thymeleaf.econtacts.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.econtacts.web.domain.User;
import org.thymeleaf.econtacts.web.service.UserService;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

	@Autowired
	UserService userService;

	@RequestMapping({ "/", "/login" })
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String showUserHomePage(@ModelAttribute User user, Model model,
			HttpSession session) {
		System.out.println("UserName" + user.getName() + "Password:"
				+ user.getPassword());
		model.addAttribute("templateName", "/table");
		session.setAttribute("userId", user);

		userService.save(user);
		return "home";
	}

}
