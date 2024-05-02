package com.salesianostriana.dam.herenciamappedsuperclass.model;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
public class Bebida extends Producto{

	private boolean esFrio;
	
	private String tipo;

	public Bebida(String nombre, float precio, boolean esFrio, String tipo) {
		super(nombre, precio);
		this.esFrio = esFrio;
		this.tipo = tipo;
	}
	
	
}
