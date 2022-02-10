package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUseable {

	
	    
	    // Inside class:    
	    private ArrayList<String> patientNotes = new ArrayList<String>();
	    private int pin;
	    private Integer id;

	
		
	    // TO DO: Constructor that takes an ID
	    public Physician(Integer id) {
	    	super(id);
	    	
	    }
	    // TO DO: Implement HIPAACompliantUser!
	    public boolean assignPin(int pin) {
	    	if (pin <1000) {
	    		return false;
	    	}
	    	else {
	    		this.setPin(pin);
	    		return true;
	    	}
	    	 
	    }
	    
	    public boolean accessAuthorized(Integer confirmedAuthID) {
	    	if( confirmedAuthID.equals(this.getId())) {
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    }
		
	    public void newPatientNotes(String notes, String patientName, Date date) {
	        String report = String.format(
	            "Datetime Submitted: %s \n", date);
	        report += String.format("Reported By ID: %s\n", this.id);
	        report += String.format("Patient Name: %s\n", patientName);
	        report += String.format("Notes: %s \n", notes);
	        this.patientNotes.add(report);
	    }

	    // TO DO: Setters & Getters
	    
		public ArrayList<String> getPatientNotes() {
			return patientNotes;
		}
		public int getPin() {
			return pin;
		}
		public void setPin(int pin) {
			this.pin = pin;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public void setPatientNotes(ArrayList<String> patientNotes) {
			this.patientNotes = patientNotes;
		}

		

}
