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
public class Comida extends Producto{

	//Tamaño de la bebida expresado en centilitros
	private String tipo;

	public Comida(String nombre, float precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}
	
	
	
}
