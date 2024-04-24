package com.salesianostriana.dam.ejemploasociaciones.modelo;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Curso {

	@Id @GeneratedValue
	private Long id;
	
	private String nombre, tutor;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy="curso", fetch = FetchType.EAGER)  //Nombre en la clase de en frente que tiene el atributo anotado con ManyToOne.
	private List<Alumno> alumnos = new ArrayList<Alumno>();

	public Curso(String nombre, String tutor) {
		this.nombre = nombre;
		this.tutor = tutor;
	}
}
