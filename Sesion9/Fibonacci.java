package Sesion9;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int n;

		do {

			Scanner leer = new Scanner(System.in);
			System.out.println("Introduzca un número: ");

			n = leer.nextInt();

			if(n < 0) 
				System.out.println("Error. Ha introducido un número negativo. Inténtelo otra vez.");
			
		}while(n < 0);
		
		System.out.printf("La soulcion es: %d", serieFibonacci(n));
	
	}
	
	public static int serieFibonacci(int n) {
		
		int suma = 0;
		
		if(n <= 1)
			suma = n;
		else
			suma = serieFibonacci(n - 1) + serieFibonacci(n - 2);
		
		return suma;
	
	}

}
