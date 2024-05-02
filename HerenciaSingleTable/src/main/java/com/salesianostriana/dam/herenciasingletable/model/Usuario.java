package com.salesianostriana.dam.herenciasingletable.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Usuario {

	@Id
	@GeneratedValue
	private Long id;
	
	private String fullName;
	
	private String username;
	private String password;
	public Usuario(String fullName, String username, String password) {
		this.fullName = fullName;
		this.username = username;
		this.password = password;
	}
	
	
}
