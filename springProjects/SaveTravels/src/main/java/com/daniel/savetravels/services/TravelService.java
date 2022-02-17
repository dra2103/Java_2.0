package com.daniel.savetravels.services;

import java.util.List;

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
	
	//create book
	public Travel createTravel(Travel t) {
		return travelRepository.save(t);
	}
	
}
