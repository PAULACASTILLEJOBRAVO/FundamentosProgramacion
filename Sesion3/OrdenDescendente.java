package Sesion3;

import java.util.Scanner;

public class OrdenDescendente {
    
    public static void main(String[] args) {
        
        int firstNumber, secondNumber, thirdNumber;
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca el primer número:");
        firstNumber = leer.nextInt();

        System.out.println("Introduzca el segundo número:");
        secondNumber = leer.nextInt(); 

        System.out.println("Introduzca el tercer número:");
        thirdNumber = leer.nextInt();

        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) 
            if (secondNumber <= thirdNumber) 
                System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
            else 
                System.out.println(secondNumber + " " + thirdNumber + " " + firstNumber);
        
        else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) 
            if (firstNumber <= thirdNumber) 
                System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
            else
                System.out.println(firstNumber + " " + thirdNumber + " " + secondNumber);
            
        else
            if (firstNumber <= secondNumber) 
                System.out.println(secondNumber + " " + firstNumber + " " + thirdNumber);
            else 
                System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);

    }

}