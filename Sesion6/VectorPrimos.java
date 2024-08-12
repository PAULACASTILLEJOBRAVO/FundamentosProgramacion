package Sesion6;

import java.util.Scanner;

public class VectorPrimos {
    
    public static void main(String[] args) {
        Scanner TECLADO = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		int num = TECLADO.nextInt();
		
        int x=num;
		int[][] factores = new int[10][2];
		int tope = 0;
		int exp;
		
		for(int i = 2; i <= x; i++) {

            exp=0;

            if((x % i == 0) && (x > 1)) {

                while(x % i == 0) {

                    x /= i;
					exp++;

                }

                factores[tope][0]=i;
				factores[tope][1]=exp;
				tope++;

            }
				
		}

		System.out.println("El número " + num + " se descompone en los siguientes factores");
		System.out.print(num + " = ");
		
		for(int i = 0; i < tope; i++) {
			
            System.out.print(factores[i][0] + "^" + factores[i][1]);
			
            if (i == tope - 1) 
				System.out.print("");
			else 
				System.out.print(" * ");
			

        }

    }

}
