package com.salesianostriana.dam.primerproyectodatajpa.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Data
@Table(name="alumnado") //Gracias a esto podemos cambiarle el nombre a la tabla.
public class Alumno {

	@Id @GeneratedValue 
	private Long id;
	
	@Column(insertable = false, columnDefinition = "VARCHAR(100)")	//Podemos realizar cambios en la columna, en los apuntes están las distinta opciones.
	private String nombre;
	
	private String apellidos;
	
	private String email;
	
	private List<LocalDate> fechas;
	
	public Alumno(String nombre, String apellidos, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}
	
	
}
