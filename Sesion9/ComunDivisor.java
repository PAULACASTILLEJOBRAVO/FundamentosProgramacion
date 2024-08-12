package Sesion9;

import java.util.Scanner;

public class ComunDivisor {

	public static void main(String[] args) {

		int n, m;

		do {

			Scanner leer = new Scanner(System.in);

			System.out.println("Introduzca el primer valor: ");
			n = leer.nextInt();

			System.out.println("Introduzca el segundo valor: ");
			m = leer.nextInt();

			if(n > m) 
				System.out.println("El primer valor debe ser menor que el segundo");

		}while(n > m);

		System.out.println(algoritmoEuclides(n, m));
	
	}
	
	public static int algoritmoEuclides(int n, int m) {
	
		int valor = 0;
		int resto = m % n;
	
		if(resto == 0) 
			valor = n;
		else 
			valor=algoritmoEuclides(n, resto);
		
		return valor;
	
	}

}
