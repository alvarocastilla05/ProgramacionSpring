package com.salesianostriana.dam.ejemploserviciobase.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.salesianostriana.dam.ejemploserviciobase.modelo.Alumno;


public interface AlumnoRepositorio extends JpaRepository<Alumno, Long>{

}
