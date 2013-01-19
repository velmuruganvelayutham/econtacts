package org.thymeleaf.econtacts.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping({ "/", "/login" })
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping({ "/home.html" })
	public String showUserHomePage() {
		return "home";
	}

}
