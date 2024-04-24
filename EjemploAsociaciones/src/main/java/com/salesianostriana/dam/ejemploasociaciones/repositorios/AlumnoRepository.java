package com.salesianostriana.dam.ejemploasociaciones.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ejemploasociaciones.modelo.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{

}
