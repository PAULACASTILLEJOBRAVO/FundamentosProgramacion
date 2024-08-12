package Sesion3;

import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        
        int note;
        final int FAILING = 4;
        final int ENOUGH = 5;
        final int GOOD = 6;
        final int NOTABLE = 8;
        final int OUTSTANDING = 9;
        final int HONORARYCERTIFICATE = 10;
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca su nota:");
        note = leer.nextInt();

        if(note > 0 && note <= FAILING)
            System.out.println("Suspenso.");
        else if(note == ENOUGH)
            System.out.println("Suficiente.");
        else if(note == GOOD)
            System.out.println("Bien.");
        else if(note > GOOD && note <= NOTABLE)
            System.out.println("Notable.");
        else if(note == OUTSTANDING)
            System.out.println("Sobresaliente.");
        else if(note == HONORARYCERTIFICATE)
            System.out.println("Matrícula de Honor.");
        else 
            System.out.println("Error. Esa nota no se puedde evaluar.");

    }

}
