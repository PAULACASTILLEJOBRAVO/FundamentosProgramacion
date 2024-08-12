package Sesion3;

import java.util.Scanner;

public class Edad {
    
    public static void main(String[] args) {
        
        int age;
        final int MAYOREDAD = 18;
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca su edad:");
        age = leer.nextInt();

        if(age >= MAYOREDAD)
            System.out.println("El usuario es mayor de edad.");
        else
            System.out.println("El usuario es menor de edad.");

    }

}
