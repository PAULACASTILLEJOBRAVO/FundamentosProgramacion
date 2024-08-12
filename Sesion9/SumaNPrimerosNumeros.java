package Sesion9;

import java.util.*;

public class SumaNPrimerosNumeros {

	public static void main(String[] args) {

		final Scanner leer = new Scanner(System.in);

		int n, sol;

		System.out.println("Escribe un numero: ");
		n = leer.nextInt();

		sol = SumaRecursiva(n);
		
		System.out.println("La solucion es: " + sol);

	}
	
	public static int SumaRecursiva(int num) {
		
		int valor = 0;

		if(num == 0) 
			valor = 0;
		else if(num > 0) 
			valor = num + SumaRecursiva(num - 1);

		return valor;

	}

}
