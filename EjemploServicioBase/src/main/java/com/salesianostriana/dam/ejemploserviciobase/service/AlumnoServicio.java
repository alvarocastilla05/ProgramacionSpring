package com.salesianostriana.dam.ejemploserviciobase.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.ejemploserviciobase.modelo.Alumno;
import com.salesianostriana.dam.ejemploserviciobase.repositorio.AlumnoRepositorio;
import com.salesianostriana.dam.ejemploserviciobase.service.base.BaseServiceImpl;

@Service
public class AlumnoServicio extends BaseServiceImpl<Alumno, Long, AlumnoRepositorio>{

}
