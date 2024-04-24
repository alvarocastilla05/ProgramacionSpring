package com.salesianostriana.dam.primerproyectodatajpa;

import java.util.function.Consumer;

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
		Alumno a = new Alumno("Alvaro", "Castilla Cano", "castilla.caalv24@triana.salesianos.edu");
		repo.save(a);
		
		a.setNombre("Otro");
		a.setApellidos("Otro 1 Otro 2");
		repo.save(a);
		
		//repo.findAll().forEach(a -> System.out.println(a));
		//repo.findAll().forEach(System.out::println);
		
		repo.findAll().forEach(new Consumer<Alumno>() {

			@Override
			public void accept(Alumno a) {
				
				
			}
			
		});
		
	}
	
	
}
