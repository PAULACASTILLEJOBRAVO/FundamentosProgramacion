package Sesion8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Numeros {
    
    public static void main(String[] args) throws IOException {
		
        Scanner teclado = new Scanner(System.in);
		
		String nombreFichero = "./Sesion8/numeros.dat";
		
        File fichero = new File(nombreFichero);
		PrintWriter salida;
		
        salida = new PrintWriter(new FileWriter(nombreFichero));
		
		int n;
		
		for(int i = 0; i < 2000; i++) {
		
            n = (int)(Math.random() * 1000000);
			salida.println(n);

        }
			
			
		salida.close();
		
		Scanner lector = new Scanner(fichero);

		System.out.println("Dime cómo quieres llamar al fichero: ");
		String nombreFichero2 = teclado.next();

		File fichero2 = new File(nombreFichero2);
		PrintWriter salida2;

		salida2 = new PrintWriter(new FileWriter(nombreFichero2));
		
        while(lector.hasNextInt()) {
		
            int num = lector.nextInt();
			
            if(primo(num)) 
			    salida2.println(num);
		
        }
		
            salida2.close();
	    	lector.close();

        Scanner lector2 = new Scanner(fichero2);

        while(lector2.hasNextInt()) {

            int num = lector2.nextInt();
			
			System.out.println(num);

        }

        lector2.close();

    }

	public static boolean primo(int n) {
		
        boolean es_primo = true;
		int i = 2;
		
        while(i < n && es_primo) {

			if (n % i == 0) 
				es_primo = false;

            i++;

        }

        return es_primo;

    }

}
