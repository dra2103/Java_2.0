package com.daniel.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.daniel.dojosandninjas.models.Dojo;
import com.daniel.dojosandninjas.models.Ninja;
import com.daniel.dojosandninjas.services.DojoService;
import com.daniel.dojosandninjas.services.NinjaService;

@Controller
public class DojoController {
	
	// Import Dojo Service and Ninja Service
	@Autowired
	private DojoService dojoService;
	@Autowired
	private NinjaService ninjaService;
	
	//Render Home page will have links to create dojo and ninja
	// ###################### Dojo #####################
	@GetMapping("/")
	public String index(Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "index.jsp";
	}
	
	@GetMapping("/dojo" )
	public String dojo( Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		model.addAttribute("newdojo", new Dojo());
		return "dojo.jsp";
	}
	
	@PostMapping("/dojo/new")
	public String createDojo(@Valid @ModelAttribute ("newdojo") Dojo dojo, BindingResult result ) {
		if(result.hasErrors()) {
			return"dojo.jsp";
		}else {
			dojoService.createDojo(dojo);
			return "redirect:/";
		}
	}
	
		
	
	
	
	// ########################## Ninja #######################
	
	@GetMapping("/ninja")
	public String ninja(@ModelAttribute ("newNinja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "ninja.jsp";
	}
	
	@PostMapping("/ninja/new")
	public String creatNinja(@Valid @ModelAttribute ("newNinja") Ninja ninjas, BindingResult result, Model model ) {
		if(result.hasErrors()) {
			model.addAttribute("ninjas", ninjas);
			return"ninja.jsp";
		}else {
			ninjaService.createNinja(ninjas);
			return "redirect:/";
		}
	}
	
	@GetMapping("/dojo/{dojo_id}/show")
	public String show(@PathVariable("dojo_id") Long dojo_id, Model model) {
		List<Ninja> ninjasAtDojo = ninjaService.ninjasAtDojo(dojo_id);
		Dojo dojo = dojoService.findDojo(dojo_id);
		System.out.println(dojo.getNinjas());
		model.addAttribute("dojo", dojo);
		model.addAttribute("ninjasAtDojo", ninjasAtDojo);
		return "show.jsp";
	}
}
