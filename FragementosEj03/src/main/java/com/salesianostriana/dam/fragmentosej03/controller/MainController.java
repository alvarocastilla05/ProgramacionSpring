package com.salesianostriana.dam.fragmentosej03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	/*
	 * Ruta de inicio, es decir, peticion a la que atiende,
	 * sin poner nada en el navegador despues de localhost:9000
	 */
	
	@GetMapping("/")
	public String index() {
		return "index";	//Mostramos la plantilla index
	}
	
	//Muestra otra página antendiendo a /otra con el mensaje de texto
	@GetMapping("/otra")
	public String otra(Model model) {
		model.addAttribute("mensaje", "Este es un mensaje en una cadena");
		return "otraPagina";
	}
}
