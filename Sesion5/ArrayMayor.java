package Sesion5;

import java.util.Scanner;

public class ArrayMayor {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
	
		System.out.println("Introduzca el tamaño del primer vector: ");
		int firstSize = leer.nextInt();
	
		int [] firstVector = new int[firstSize];
		
		for (int i = 0; i < firstSize; i++) { 
			System.out.println("Introduce el valor en la posición " + i + " del vector.");
			firstVector[i] = leer.nextInt();
		}
		
		System.out.println("Introduzca el tamaño del segundo vector: ");
		int secondSize = leer.nextInt();
		
		int [] secondVector = new int[secondSize];
		
		for (int i = 0; i < secondSize; i++) { 
		
			System.out.println("Introduce el valor en la posición " + i + " del vector.");
			secondVector[i] = leer.nextInt();
	
		}

		if(firstVector.length > secondVector.length) { 
			int [] thirdVector = new int[firstVector.length];
			
			for(int i = 0; i < secondVector.length; i++) 
				if(firstVector[i] > secondVector[i]) 
					thirdVector[i] = firstVector[i];
				else if(firstVector[i] <= secondVector[i])
					thirdVector[i] = secondVector[i];
				
			for(int j = 0; j < thirdVector.length; j++) 
				if (thirdVector[j] == 0) {
			
					int thirdSize = secondVector.length;
					thirdVector[j]=firstVector[thirdSize];
					thirdSize++;
			
				}
			
			
			System.out.println("El vector resultado es: "); 

			for(int k = 0; k < firstVector.length; k++) 
				System.out.print(" " + thirdVector[k]);
			
		}else if (firstVector.length <= secondVector.length) { 
			int [] thirdVector = new int[secondVector.length];
			
			for(int i = 0; i < firstVector.length; i++) 
				if(firstVector[i] > secondVector[i]) 
					thirdVector[i] = firstVector[i];
				else if(firstVector[i] <= secondVector[i])
					thirdVector[i] = secondVector[i];			
			
			for(int j = 0; j < thirdVector.length; j++) 
				if (thirdVector[j] == 0) {
					
					int thirdSize = firstVector.length;
					thirdVector[j] = secondVector[thirdSize];
					thirdSize++;
				
				}
			
			
			System.out.println("El vector resultado es: ");

			for(int k = 0; k < secondVector.length; k++) 
				System.out.print(" " + thirdVector[k]);
			
		}
	}
}
