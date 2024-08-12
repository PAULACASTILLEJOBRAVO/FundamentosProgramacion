package Sesion3;

import java.util.Scanner;

public class NumeroMayor {
    
    public static void main(String[] args) {
        
        int firstNumber, secondNumber;
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca el primer número:");
        firstNumber = leer.nextInt();

        System.out.println("Introduzca el segundo número:");
        secondNumber = leer.nextInt();

        if(firstNumber > secondNumber)
            System.out.printf("%d es mayor que %d.\n", firstNumber, secondNumber);
        else if(firstNumber == secondNumber)
            System.out.println("Ambos números son iguales.");
        else if(firstNumber < secondNumber)
        System.out.printf("%d es mayor que %d.\n", secondNumber, firstNumber);

    }

}
