package com.daniel.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.daniel.dojosandninjas.models.Dojo;
import com.daniel.dojosandninjas.repos.DojoRepo;

@Service
public class DojoService {
	// Add DojoRepo as a dependency
	private final DojoRepo dojoRepo;
	
	public DojoService(DojoRepo dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	// returns all dojos
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	// create dojo
	public Dojo createDojo(Dojo d) {
		return dojoRepo.save(d);
	}
	
	// update
	public Dojo updateDojo(Dojo d) {
		return dojoRepo.save(d);
	}
	
	// retrieve dojo
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
	
	// delete
	public void deleteDojo(Long id) {
		dojoRepo.deleteById(id);
	}

}
