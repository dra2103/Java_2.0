package com.daniel.hoppersreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainCointroller {
	

	@RequestMapping("/")
	public String index (Model model) {
		// class definition and imports here..
        String name = "Daniel Adamski";
        String itemName = "PS 5";
        double price = 599.99;
        String description = "Gaming console";
        String vendor = "GameStop";
	    
    	// Your code here! Add values to the view model to be rendered
    
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
	   

		return "cool.jsp";
	}
	

}
