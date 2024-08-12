package Sesion8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AliasPuntación {
    public static void main(String[] args) throws IOException {
		
		Scanner teclado = new Scanner(System.in);
		
        System.out.println("Dime cómo quieres llamar al fichero: ");
		String nombreFichero = teclado.next();
		
        File fichero = new File(nombreFichero);
		PrintWriter salida;

        boolean masNombres = true;
		salida = new PrintWriter(new FileWriter(nombreFichero));
		
		do {
		
            System.out.print("\nIntroduzca un nombre: ");
			String nombreJugadores = teclado.next();
		
            int puntuajeJugadores = (int) (Math.random()*10000);
			
			salida.println(nombreJugadores + ";" + puntuajeJugadores);
			
            System.out.print("¿Quieres introducir más nombres? Teclea s");
			masNombres = teclado.next().equals("s");
		
        }while(masNombres);
		
        salida.close();
		
        leerJugadores(nombreFichero);
	
    }
	
	public static void leerJugadores(String cadena) throws IOException {
	
        File f = new File(cadena);
		Scanner escaner = new Scanner(f);

		String texto, nombre, pts, titulo = null;
		int mayor = 0;
		
		while (escaner.hasNext()) {
			
            texto = escaner.next();
			nombre = texto.substring(0, texto.indexOf(";"));
			pts = (texto.substring(texto.indexOf(";")+1));
			
            int puntos = Integer.parseInt(texto.substring(texto.indexOf(";")+1));
			
            if(puntos > mayor) {
			
                mayor = puntos;
				titulo = mayor + " de " + nombre;
			
            }
			
            System.out.println("> " + nombre + " = " + pts);
		
        }
		
        System.out.println("El puntuaje mayor es " + titulo);
		
        escaner.close();
	
    }

}
