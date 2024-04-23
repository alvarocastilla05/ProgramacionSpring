package com.salesianostriana.dam.ejemplo03bd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

	@Autowired
	private Saludator saludator;
	
	

	@GetMapping("/")
	@ResponseBody //Esta es solo para este ejemplo
	public String welcome() {
		return saludator.saludar();
	}
}
