package pruebaInterfaz;

public class Jugador implements PuedeSaltar{

	@Override
	public void saltarHaciaArriba() {
		System.out.println("Puede saltar hacia arriba");
		
	}

	@Override
	public void saltarHaciaAdeltante() {
		System.out.println("Puede saltar hacia adelante");
		
	}

	
}
