package com.salesianostriana.dam.ejemploseguridad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeControler {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
}
