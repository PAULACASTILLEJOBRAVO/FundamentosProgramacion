package Sesion6;

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
		
        int option = 1;
		int firstNumber = 0, secondNumber = 0;

		while(option != 0){

            System.out.println("1.- Sumar.");
			System.out.println("2.- Restar.");
			System.out.println("3.- Multiplicar.");
			System.out.println("4.- División y módulo.");
			System.out.println("0.- Salir.");
			option=leer.nextInt();

			if(option >= 1 & option <= 4) {

                System.out.println("Introduce el primer operando: ");
				firstNumber = leer.nextInt();

                System.out.println("Introduce el segundo operando: ");
				secondNumber = leer.nextInt();

            }
			
			switch(option) {

                case 0:
                    System.out.println("Cerrando calculadora...");
                    break;

                case 1:
                    System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                    break;

                case 2:
                    System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                    break;

                case 3:
                    System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));				
                    break;
        
                case 4:
                    System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                    System.out.println(firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));			
                    break;
            
                default:
                    System.out.println("Error. Opción incorrecta.");
                    break;
		
            }
		
        }

    }

}
