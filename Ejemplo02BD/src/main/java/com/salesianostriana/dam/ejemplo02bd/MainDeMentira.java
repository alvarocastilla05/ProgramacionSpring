package com.salesianostriana.dam.ejemplo02bd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	@Autowired
	private Saludator saludator;
	
	
	@PostConstruct 		//Esto quiere decir que cuando se ejecute el proyecto, esto se va a ejecutar.
	public void init() {
		
		saludator.imprimirSaludo();
	}
}
