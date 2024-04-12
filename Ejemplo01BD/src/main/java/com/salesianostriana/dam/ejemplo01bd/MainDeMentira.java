package com.salesianostriana.dam.ejemplo01bd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	@Autowired
	@Qualifier("englishSaludator")	/*Esto hace que aunque haya uno con un bean Primary, escoja el bean que le indico. El nombre del bean lo debemos de indicar con la primera letra en minúscula*/
	private Saludator saludator;
	
	
	@PostConstruct 		//Esto quiere decir que cuando se ejecute el proyecto, esto se va a ejecutar.
	public void init() {
		
		saludator.imprimirSaludo();
	}
}
