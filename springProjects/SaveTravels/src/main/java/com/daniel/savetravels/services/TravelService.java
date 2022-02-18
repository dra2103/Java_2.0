package com.daniel.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.daniel.savetravels.models.Travel;
import com.daniel.savetravels.repos.TravelRepo;

@Service
public class TravelService {
	// Add TravelRepo as a dependency
	private final TravelRepo travelRepository;
	
	public TravelService(TravelRepo travelRepository) {
		this.travelRepository = travelRepository;
	}
	
	//returns all expenses
	public List<Travel> allTravels() {
		return travelRepository.findAll();
	}
	
	//create expense
	public Travel createTravel(Travel t) {
		return travelRepository.save(t);
	}
	
	public Travel updateTravel(Travel t) {
		return travelRepository.save(t);
	}
	
	// retrieve expense
	public Travel findTravel(Long id) {
		Optional<Travel> optionalTravel = travelRepository.findById(id);
		if(optionalTravel.isPresent()) {
			return optionalTravel.get();
		} else {
			return null;
		}
	}
	
	public void deleteTravel(Long id) {
		travelRepository.deleteById(id);
		
	}
}
