
package Sesion2;

import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {
        //Declaración del objeto que nos permite la entrada de datos, en este caso desde teclado (System.in)
        Scanner leer =new Scanner (System.in);

        //Declaración de variables para los datos del usuario
        String name = "";
        String surname = "";
        int age = 0;
        
        //Solicitamos nombre y lo recibimos desde teclado para guardarlo en la variable correspondiente
        System.out.println("Introduzca su nombre:");
        name = leer.next();
        
        //Lo mismo para apellidos
        System.out.println("Introduzca sus apellidos:");
        surname = leer.next();
        
        //Y también para edad, en este caso es un entero, así que usamos nextInt()
        System.out.println("Introduzca su edad:");
        age = leer.nextInt();
        
        //Mostramos el valore recogido en las variables
        System.out.println("Nombre: " + name);
        System.out.println("Apellidos: " + surname);
        System.out.println("Edad: " + age);
        
    }
    
}