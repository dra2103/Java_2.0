package com.daniel.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	
	@RequestMapping("/")
	public String index1(@RequestParam(value="name", required=false)String name, @RequestParam(value="last_name", required=false) String lastname) {
		if(name == null) {
			return "Hello Human";
		}else if(lastname == null) {
		return "Hello " + name;
		}
		else {
			return "Hello " + name +" " + lastname;
		}
	}

}
