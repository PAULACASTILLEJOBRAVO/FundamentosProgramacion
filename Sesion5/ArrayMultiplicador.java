package Sesion5;

import java.util.Scanner;
public class ArrayMultiplicador {

	public static void main(String[] args) {
		
        Scanner leer = new Scanner(System.in);
		
        System.out.println("Introduzca el tamaño del primer vector: ");
        int firstSize = leer.nextInt();

		System.out.println("Introduzca el tamalo del segundo vector: ");
		int secondSize = leer.nextInt();
		
        double [] firstVector =new double [firstSize];
		double [] secondVector =new double [secondSize];
		double [] [] matriz=new double [secondSize][firstSize];
		
        double firstNumber;
		double secondNumber;
		
        for(int i = 0; i < firstVector.length; i++) {

			firstNumber = Math.random()*10;
			firstVector[i]=firstNumber;
		
        }
		
        System.out.printf("\t %.2f", firstVector[0]);
		
        for(int i = 1; i < firstVector.length; i++)
			System.out.printf(" %.2f", firstVector[i]);
	
		System.out.println();

		for(int i = 0; i < secondVector.length; i++) {
			
            secondNumber = Math.random()*10;
			secondVector[i] = secondNumber;
		
        }
		
		for(int i = 0; i < matriz.length; i++) 
            for(int j = 0; j < matriz[i].length; j++) 
                matriz[i][j] = secondVector[i] * firstVector[j];
			
		for(int i = 0; i < matriz.length; i++) {

			System.out.printf( "%.2f", secondVector[i]);
			
            for(int j = 0; j < matriz[i].length; j++) 
                System.out.printf(" %.2f", matriz[i][j]);
			
            System.out.println();
		}
	
    }

}
