package com.salesianostriana.dam.ejemplo02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Anotamos con controller
@Controller
public class ProductController {

	/*Necesitamos un objeto del tipo ProductService dentro de esta clase para poder llamar 
	 * dentro de los métodos a los métodos de servicio */
	@Autowired
	private ProductService service;
	
	@GetMapping("/productos")
	public String controladorCondicionales (Model model) {
		
		/*Añadimos al model la lista de productos que viene del servicio, devuelta por el getLista.*/
		
		model.addAttribute("productList", service.getLista());
		return "PlantillaBucleYFormateo";//Se devuelve el nombre de la plantilla HTML.
			}
}
