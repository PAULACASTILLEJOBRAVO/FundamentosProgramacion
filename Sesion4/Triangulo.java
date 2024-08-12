package Sesion4;

import java.util.Scanner;

public class Triangulo {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce la altura del triángulo: ");
        int number = leer.nextInt();
        
        for (int i = 0; i < number; i++){
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
