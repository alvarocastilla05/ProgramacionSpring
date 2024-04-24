package com.salesianostriana.dam.ejemploasociaciones;

import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.ejemploasociaciones.modelo.Alumno;
import com.salesianostriana.dam.ejemploasociaciones.modelo.Curso;
import com.salesianostriana.dam.ejemploasociaciones.repositorios.AlumnoRepository;
import com.salesianostriana.dam.ejemploasociaciones.repositorios.CursoRepository;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	@Autowired
	private AlumnoRepository alumnoRepo;
	
	@Autowired
	private CursoRepository cursoRepo;
	
	@PostConstruct
	void ejecutar() {
		Curso c = new Curso("1ºDAM", "Miguel Campos");
		cursoRepo.save(c);
		Alumno a = new Alumno("Alvaro", "Castilla Cano", "castilla.caalv24@triana.salesianos.edu");
		a.addToCurso(c);
		alumnoRepo.save(a);
		
		a.setNombre("Otro");
		a.setApellidos("Otro 1 Otro 2");
		alumnoRepo.save(a);
		
		//alumnoRepo.findAll().forEach(a -> System.out.println(a));
		/*
		alumnoRepo.findAll().forEach(new Consumer<Alumno>() {

			@Override
			public void accept(Alumno a) {
			}
			
		});*/
		alumnoRepo.findAll().forEach(System.out::println);
		c.getAlumnos().forEach(System.out::println);
	}
	
	
}
