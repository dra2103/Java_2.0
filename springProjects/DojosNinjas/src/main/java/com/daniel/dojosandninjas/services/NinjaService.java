package com.daniel.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.daniel.dojosandninjas.models.Ninja;
import com.daniel.dojosandninjas.repos.NinjaRepo;

@Service
public class NinjaService {
	// Add NinjaRepo as a dependency
	private final NinjaRepo ninjaRepo;
	
	public NinjaService (NinjaRepo ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	// returns all ninjas
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	//create ninja
	public Ninja createNinja(Ninja n) {
		return ninjaRepo.save(n);
	}
	
	// update
	public Ninja updateNinja(Ninja n) {
		return ninjaRepo.save(n);
	}
	
	// retrieve ninja
	public Ninja findNinja (Long id) {
		Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		} else {
			return null;
		}
	}
	
//	public List<Ninja> ninjasAtDojo(Long id) {
//		return ninjaRepo.findByDojo_id(id);
//	}

}
