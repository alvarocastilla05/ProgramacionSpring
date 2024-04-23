package com.salesianostriana.dam.primerproyectodatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.primerproyectodatajpa.modelo.Alumno;
import com.salesianostriana.dam.primerproyectodatajpa.repositorios.AlumnoRepository;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	@Autowired
	private AlumnoRepository repo;
	
	@PostConstruct
	void ejecutar() {
		repo.save(new Alumno("Alvaro", "Castilla Cano", "castilla.caalv24@triana.salesianos.edu"));
		
	}
	
	
}
