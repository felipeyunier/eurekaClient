package com.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.ws.UuidClientWs;

@RestController
public class ControllerRest {

	@Autowired
	private UuidClientWs uuidClientWs;
	
	@GetMapping(value="/clienteRest")
	public String home() {
		return "Eureka Client App -> " + uuidClientWs.getUuid();
	}
}
