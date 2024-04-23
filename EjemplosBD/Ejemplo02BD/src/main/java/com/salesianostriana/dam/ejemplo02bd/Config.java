package com.salesianostriana.dam.ejemplo02bd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

	@Bean
	@Primary
	public Saludator SpanishSaludator() {
		return new SpanishSaludator();
	}
	
	@Bean
	public Saludator EnglishSaludator() {
		return new EnglishSaludator();
	}
	
	//Esto hace lo mismo que el ejemplo01, lo único que este no tiene las anatociones en las clases.
}
