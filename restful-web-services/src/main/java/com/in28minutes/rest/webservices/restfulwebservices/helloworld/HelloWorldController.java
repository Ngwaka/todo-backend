package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class HelloWorldController {
	
	
	@GetMapping(path =  "/hello-wold-bean")
	public HelloWorldBean helloworldBean() {
		return new HelloWorldBean("Hello Wold");
	}
	
	
	
	@GetMapping(path =  "/hello-wold-bean/path-variable/{name}")
	public HelloWorldBean helloworldBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello Wold %s", name));
	}

}
