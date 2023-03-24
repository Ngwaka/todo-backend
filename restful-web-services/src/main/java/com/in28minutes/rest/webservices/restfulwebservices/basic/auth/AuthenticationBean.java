package com.in28minutes.rest.webservices.restfulwebservices.basic.auth;

public class AuthenticationBean {

	private Object name;

	public AuthenticationBean(String name) {
		this.name = name;
	}

	public Object getName() {
		return name;
	}

	public void setName(Object name) {
		this.name = name;
	}
	
	
	
}
