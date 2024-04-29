package com.salesianostriana.dam.ejemploserviciobase.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.ejemploserviciobase.service.AlumnoServicio;

@Controller
public class AlumnoControlador {
	
	@Autowired
	private AlumnoServicio alumnoServicio;
	
	@GetMapping("/list")
	public String lista(Model model) {
		model.addAttribute("alumnos", alumnoServicio.findAll());
		return "lista";
	}

}