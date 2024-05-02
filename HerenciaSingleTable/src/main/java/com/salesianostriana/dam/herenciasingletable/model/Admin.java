package com.salesianostriana.dam.herenciasingletable.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Admin extends Usuario{

	public Admin(String fullName, String username, String password) {
		super(fullName, username, password);
	}

}
