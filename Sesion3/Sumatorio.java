package Sesion3;

import java.util.Scanner;

public class Sumatorio {
    
    public static void main(String[] args) {

        int n;
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduzca el valor de N: ");
        n = leer.nextInt();
    
        System.out.printf("Sumatorio calculado con while: %d.\n", sumatorioWhile(n));

        System.out.printf("Sumatorio calculado con do while: %d.\n", sumatorioDoWhile(n));

        System.out.printf("Sumatorio calculado con for: %d.\n", sumatorioFor(n));

    }

    public static int sumatorioWhile(int n){
        
        int suma, i;
        
        suma = 0;
        i = 1;
        
        while (i <= n) {
            suma = suma + i;
            i = i + 1;
        }

        return suma;

    }

    public static int sumatorioDoWhile(int n) {
        
        int suma, i;
        
        suma = 0;
        i = 1;
        
        do {
            suma = suma + i;
            i = i + 1;
        } while (i <= n);
        
        return suma;
        
    }

    public static int sumatorioFor(int n) {
        
        int suma, i;
        
        suma = 0;
        
        for (i = 1; i <= n; i++) {
            suma = suma + i;
        } // fin del for
    
        return suma;
        
    }

}