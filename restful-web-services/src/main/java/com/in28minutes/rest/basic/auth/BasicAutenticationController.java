package com.in28minutes.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class BasicAutenticationController {
	
	
	@GetMapping(path =  "/basicauth")
	public AuthenticationBean helloworldBean() {
		return new AuthenticationBean("You are authenticated");
	}
	
	
	
	

}
