package com.salesianostriana.dam.ejemplo01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data					//Getters and Setters, toString, hashCode, equals
@AllArgsConstructor		//Constructor con atributos
@NoArgsConstructor		//Constructo vacio
public class Persona {

	private String nombre;
	private String apellidos;
}
