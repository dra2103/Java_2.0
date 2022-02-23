package com.daniel.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		return "index.jsp";
	}
	
	// ############ create ####################
	@PostMapping("/expenses/new")
	public String create(@Valid @ModelAttribute("expenses")Travel expenses, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Travel> travels = travelService.allTravels();
			model.addAttribute("travels", travels);
			return "index.jsp";
		}else {
			travelService.createTravel(expenses);
			return "redirect:/expenses";
			
		}
	}
	
	// ############### edit expense ####################
	
	@RequestMapping("/expenses/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Travel travel = travelService.findTravel(id);
		model.addAttribute("exp", travel);
		return "edit.jsp";
	}
	
	
    @PutMapping("/expenses/{id}")
    public String update(@Valid @ModelAttribute("exp") Travel exp, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
           travelService.updateTravel(exp);
            return "redirect:/expenses";
        }
    }
    
    @DeleteMapping("/expenses/{id}")
    public String destroy(@PathVariable("id") Long id) {
        travelService.deleteTravel(id);
        return "redirect:/expenses";
    }
	
	// Show one expense
	
    @RequestMapping("/expenses/{id}")
    public String  index(@PathVariable("id") Long id, Model model) {
        Travel expense = travelService.findTravel(id);
        model.addAttribute("expense", expense);
        return "/show.jsp";
   
    }
}
