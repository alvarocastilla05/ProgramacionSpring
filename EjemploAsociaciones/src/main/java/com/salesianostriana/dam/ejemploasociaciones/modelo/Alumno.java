package com.salesianostriana.dam.ejemploasociaciones.modelo;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Data
public class Alumno {

	@Id @GeneratedValue 
	private Long id;
	
	private String nombre;
	
	private String apellidos;
	
	private String email;
	
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_alumno_curso"))
	private Curso curso;
	
	public Alumno(String nombre, String apellidos, String email, Curso curso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.curso = curso;
	}
	
	public Alumno(String nombre, String apellidos, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}
	
	//Métodos Auxiliares.
	
	public void addToCurso(Curso c) {
		this.curso = c;
		c.getAlumnos().add(this);
	}
	
	public void removeFromCurso(Curso c) {
		c.getAlumnos().remove(this);
		this.curso = null;
	}
	
	
	
}
