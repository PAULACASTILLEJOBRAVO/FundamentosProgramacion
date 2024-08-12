package Sesion3;

import java.util.Scanner;

public class ParesComprometidos {
    
    public static void main(String[] args) {
        
        int firstNumber, secondNumber;
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca el primer número:");
        firstNumber = leer.nextInt();

        System.out.println("Introduzca el segundo número:");
        secondNumber = leer.nextInt();

        if (firstNumber < secondNumber)
            pares(firstNumber, secondNumber);
        else if(firstNumber > secondNumber)
            pares(secondNumber, firstNumber);

    }

    public static void pares(int menor, int mayor){
        int suma = 0;
        System.out.print("Pares: ");
        for(int i = menor; i<mayor; i++){
            if(i%2 == 0){
                System.out.printf("%d ", i);
                suma += i;
            }
        }

        System.out.printf("\nSuma: %d\n", suma);
    
    }
}
