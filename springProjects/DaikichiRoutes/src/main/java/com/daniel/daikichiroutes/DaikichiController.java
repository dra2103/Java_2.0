package com.daniel.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	//1. Annotation
	@RequestMapping("")
	public String index() {
		return"Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/{word}")
	public String word(@PathVariable("word") String word) {
		return "You have said " + word +"!";
	}
	
	@RequestMapping("/{number}/")
	public String number(@PathVariable("number") Integer number) {
		return "Your lucky number is " + number + "!";
	}
	
	
	@RequestMapping("/travel/{destination}")
	public String travel(@PathVariable("destination") String destination) {
		return "Congratiualtions! You will soon travel to " + destination + "!";
	}
	
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") Integer number) {
		if (number % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}else {
			return "You have enjoyed the fruitd of your labor but now is a great time to spend time with family and friends";
		}
	}

}
