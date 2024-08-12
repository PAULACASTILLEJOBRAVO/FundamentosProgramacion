package Sesion7;

import java.util.Scanner;

public class CoeficienteBinomial {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

		int salir;

		do {

			System.out.println("Dime el numero de elementos de los subconjuntos: ");
			double n = leer.nextDouble();
			
            System.out.println("Dime el número elementos del conjunto: ");
			double k = leer.nextDouble();
			
            System.out.println("El numero combinatorio de la primitiva es " + Combinatorio(n, k));
			System.out.println("¿Desea introducir otro coeficiente? ");
			System.out.println("Seguir calculando, teclea 1.");
			System.out.println("Otra tecla para salir.");
			salir = leer.nextInt();

		}while(salir == 1);
	}
	
	public static double Factorial(double n) {
		
        double factorial = 1;
		
        for (double i = 1; i <= n; i++) 
			factorial = factorial * i;
		
		return factorial;

	}

	public static double Combinatorio(double n, double k) {
		
        double combinacion = 0;
		
        if(k <= n) 
			combinacion = (Factorial(n) / (Factorial(k) * Factorial(n-k)));
		
        return combinacion;
	
    }

}
