package com.salesianostriana.dam.composicion02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.composicion02.modelo.Asiento;
import com.salesianostriana.dam.composicion02.modelo.Avion;
import com.salesianostriana.dam.composicion02.modelo.TipoAsiento;
import com.salesianostriana.dam.composicion02.repositorios.AvionRepositorio;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {
	
	@Autowired
	private AvionRepositorio repositorio;

	@PostConstruct
	void ejecutar() {
		Avion airbus320 = Avion.builder()
				.modelo("Airbus A320")
				.maxPasajeros(300)
				.build();
		
		for(int i = 1; i<=2;i++) {
			for(int j = 1; j<=6; j++) {
				airbus320.addAsiento(
						Asiento.builder()
						.tipo(TipoAsiento.PRIMERA)
						.fila(i)
						.columna(j)
						.build()						
						);
			}
		}
		
		for(int i = 3; i<=50;i++) {
			for(int j = 1; j<=6; j++) {
				airbus320.addAsiento(
						Asiento.builder()
						.tipo(TipoAsiento.TURISTA)
						.fila(i)
						.columna(j)
						.build()						
						);
			}
		}
		
		repositorio.save(airbus320);

	}
}
