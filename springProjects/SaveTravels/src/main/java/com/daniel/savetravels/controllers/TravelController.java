package com.daniel.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.daniel.savetravels.models.Travel;
import com.daniel.savetravels.services.TravelService;


@Controller
public class TravelController {
	
	//import TravelService
	@Autowired
	private TravelService travelService;
	
	//Render Home page with List and Create Expense
	@GetMapping("/expenses")
	public String index(@ModelAttribute("expenses") Travel expenses, Model model) {
		List<Travel> travel = travelService.allTravels();
		model.addAttribute("travels", travel);
		return "/index.jsp";
	}
	
	@PostMapping("/expenses/new")
	public String create(@Valid @ModelAttribute("expenses")Travel travel, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		}else {
			travelService.createTravel(travel);
			return "redirect:/expenses";
			
		}
	}
	
}
