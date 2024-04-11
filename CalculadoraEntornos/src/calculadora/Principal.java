package calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double num1, num2;
		int op;
		String aux;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("""
					1-Sumar.
					2-Restar.
					3-Multiplicar.
					4-Dividir.
					""");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 0:
					System.out.println("Saliendo...");
				default:
					System.out.println("Opción no válida.");
			}
		}while(op!=0);

	}

}
