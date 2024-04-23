package com.salesianostriana.dam.ejemplo01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorSaludo {

	@GetMapping({ "/", "welcome" })
	public String welcome(@RequestParam(name = "nombre", required = false, defaultValue = "Mundo") String nombre, Model model) {
		model.addAttribute("nombre", nombre);// Incluimos la información en el modelo
		return "index";	//Nombre de la página HTML ya que es lo que vamos a devolver.
	}
	
	
	@GetMapping("/saludo2")
	public String welcome2(Model model) {
		model.addAttribute("persona", new Persona("Alvaro", "Castilla Cano"));
		return "SaludoPersonalizado";
	}
	
	@GetMapping("/saludo3")
	public String welcome3(Model model) {
		model.addAttribute("saludo", "Hola Mundo");
		model.addAttribute("mensaje", "¡Se me está haciendo largo el proyecto final!");
		model.addAttribute("url", "https://triana.salesianos.edu");
		
		return "SaludoYEnlace";
	}
}


/*La diferencia entre el welcome1 y el welcome2 es que el 2 no hace falta que le pasemos parametros*/


