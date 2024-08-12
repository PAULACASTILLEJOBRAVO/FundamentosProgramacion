package Sesion7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Primitiva {
    
    public static void main(String[] args) {
		
        Scanner TECLADO = new Scanner(System.in);

		System.out.println("Introduce el número de apuestas: ");
		int nApuestas = TECLADO.nextInt();		
		
		for(int i = 0; i < nApuestas; i++) 
			genera_apuesta();
		
		int reintegro = genera_reintegro();

		System.out.println("El reintegro del sorteo es el " + reintegro);
		System.out.println("El coste del boleto es de "+ nApuestas + "€");

	}
	
	public static void genera_apuesta() {
		
        int[] boleto = new int[6];
		int i = 0;
		int n;
		boolean repetido = false;
		
        while(i < 6) {
			
            n = (int) (Math.random() * 49 + 1);
			repetido = false;

			for(int j = 0; j < i; j++) 
				if(boleto[j] == n) 
					repetido = true;

			if(!repetido) {

                boleto[i] = n;
	    		i++;
		
            }	
		
        }
		
        Arrays.sort(boleto);
		
        System.out.print("Sorteo: ");

		for(int j = 0; j < 6; j++) 
			System.out.printf("%4d", boleto[j]);

        System.out.println();		

    }
	
	public static int genera_reintegro() {

        int reintegro ;
		Random generador = new Random();
		reintegro = generador.nextInt(9);

        return reintegro;

    }

}
