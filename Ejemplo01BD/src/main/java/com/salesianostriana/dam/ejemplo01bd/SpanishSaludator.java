package com.salesianostriana.dam.ejemplo01bd;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Primary		//Si en algun momento hay duda en que bean coger, coge este que es el primario.
public class SpanishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		System.out.println("Hola a todos los programadores de 1ºDAM");
	}
	
	@PostConstruct
	void alComenzar() {
		System.out.println("Método \"alComenzar\" anotado con @PostConstruct");
	}
	
	@PreDestroy
	void antesDeDestruir() {
		System.out.println("Método \"antesDeDestruir\" anotado con @PreDestroy");
	}

}
