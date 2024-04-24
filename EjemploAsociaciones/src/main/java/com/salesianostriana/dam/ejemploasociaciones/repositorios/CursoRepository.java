package com.salesianostriana.dam.ejemploasociaciones.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ejemploasociaciones.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}
