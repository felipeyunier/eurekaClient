package com.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRest {

	@GetMapping(value="/clienteRest")
	public String home() {
		return "Eureka Client App";
	}
}
