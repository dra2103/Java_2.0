package com.daniel.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index() {
		return "omikuji.jsp";
	}
	
	@RequestMapping("/omikuji")
	public String omikuji(@RequestParam(value="number") Integer number,
							@RequestParam(value="city") String city,
							@RequestParam(value="name") String name,
							@RequestParam(value="hobbie") String hobbie,
							@RequestParam(value="living") String living,
							@RequestParam(value="kind") String kind,
							HttpSession session) {
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobbie", hobbie);
		session.setAttribute("living", living);
		session.setAttribute("kind", kind);
		
		return "redirect:/omikujishow";
		
	}
	
	@RequestMapping("/omikujishow")
	public String omikujiShow() {
		return "omikujishow.jsp";
	}

}
