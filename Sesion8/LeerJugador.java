package Sesion8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeerJugador {
    
    public static void main(String[] args) throws IOException {

        Scanner lectura_teclado;
        Scanner lectura_fichero;
        File fichero;
        String nombrefich;
        
        lectura_teclado = new Scanner(System.in);
        
        System.out.println("Introduzca el nombre del fichero");
        nombrefich = lectura_teclado.next();
        
        //nombrefich = "./Sesion8/Jugador.txt";
        
        fichero = new File(nombrefich);
        lectura_fichero = new Scanner(fichero);

        System.out.println("\nLeyendo de fichero " + nombrefich + " e imprimiendo en pantalla");
        
        while (lectura_fichero.hasNext()) {

            String alias = lectura_fichero.next();
            System.out.println(alias);

        } 
        
        lectura_fichero.close();
        lectura_teclado.close();
    
    }

}
