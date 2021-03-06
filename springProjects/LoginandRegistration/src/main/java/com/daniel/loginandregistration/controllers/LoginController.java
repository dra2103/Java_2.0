package com.daniel.loginandregistration.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.daniel.loginandregistration.models.LoginUser;
import com.daniel.loginandregistration.models.User;
import com.daniel.loginandregistration.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userServ;
	
	// Login Landing Page
	@GetMapping("/")
	public String index(Model model) {
		// Bind empty User and LoginUser objects to the JSP
		// to capture the form input
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "index.jsp";
		
	}

	// Register New User
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, 
							BindingResult result, 
							Model model, 
							HttpSession sesh) {
		
		// execute the Service to Register first!
		userServ.register(newUser, result);
		//check for errors
		if (result.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		} else {
			sesh.setAttribute("user_id", newUser.getId());
			return "redirect:/home";
		}
		
	}
	
	//Login
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin,
						BindingResult result,
						Model model,
						HttpSession sesh) {
		
		User user = userServ.login(newLogin, result);
		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "index.jsp";
		} else {
			sesh.setAttribute("user_id", user.getId());
			return "redirect:/home";
		}
	}
	

	
	// Logout
	@GetMapping("/logout")
	public String logout(HttpSession sesh) {
		sesh.invalidate();
		return "redirect:/";
	}
	

}
