package com.daniel.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index(HttpSession session) { 
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		}else {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount ++;
			session.setAttribute("count", currentCount);
			
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String showCounter() {
//		session.getAttribute(null)
		return "counter.jsp";
	}
	
	@RequestMapping("/counter2")
	public String showCounter(HttpSession session ) {
		Integer currentCount = (Integer) session.getAttribute("count");
		currentCount += 2;
		session.setAttribute("count", currentCount);
		return "index.jsp";
		
	}
	


}
