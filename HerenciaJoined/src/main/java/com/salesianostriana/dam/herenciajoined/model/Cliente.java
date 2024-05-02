package com.salesianostriana.dam.herenciajoined.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Cliente {

	@Id
	@GeneratedValue
	private Long id;
	
	private String email;
	
	private String nombre;
	private String apellidos;
	public Cliente(String email, String nombre, String apellidos) {
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	
}
