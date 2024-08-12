package Sesion8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirJugador {
    
    public static void main(String[] args) throws IOException {
        Scanner lectura_teclado;

        File fichero;
        PrintWriter salida;
        String nombrefich;
        
        lectura_teclado = new Scanner(System.in);
        
        System.out.println("Introduzca el nombre del fichero");
        nombrefich = lectura_teclado.next();

        //nombrefich = "./Sesion8/Jugador.txt";
        
        fichero = new File(nombrefich);
        salida = new PrintWriter(new FileWriter(fichero));
        
        boolean masAlias = false;
        
        do {
            System.out.print("\nIntroduzca un alias de jugador: ");
            String alias = lectura_teclado.next();
            
            salida.println(alias);
            
            System.out.print("Introducir más alias? (s/n) ");
            masAlias = lectura_teclado.next().equals("s");
        
        } while (masAlias);
        
        salida.close(); 
        lectura_teclado.close();
        
    }

}
