package com.salesianostriana.dam.herenciasingletable.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("C")
public class Cliente extends Usuario{

	public Cliente(String fullName, String username, String password) {
		super(fullName, username, password);
	}

}
