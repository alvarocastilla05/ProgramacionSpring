package com.salesianostriana.dam.ejemplo01bd;

import org.springframework.stereotype.Service;

@Service
public class EnglishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		System.out.println("Hellos coders of 1ºDAM");
		
	}

}
