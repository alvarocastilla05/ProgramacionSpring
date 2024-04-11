package calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double num1, num2;
		int op;
		String aux;
		double resta;
		
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
					System.out.println("Introduzca numero 1:");
					aux=sc.nextLine();
					num1=Integer.parseInt(aux);
					
					System.out.println("Introduzca numero 2:");
					aux=sc.nextLine();
					num2=Integer.parseInt(aux);
					
					resta = num1+num2;

					System.out.println(resta);
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
