package Sesion4;

import java.util.Scanner;

public class Primos {
    
    public static void main(String[] args) {
            
        int num;
        boolean primo = true;

        Scanner leer = new Scanner(System.in);

        System.out.println("Dime un número: ");
        num = leer.nextInt();

        int i = 2;

        while (i < num/2 && primo) {
            if(num%i == 0){
                primo=false;
            }
            i++;
        }

        if (primo) 
            System.out.printf("El número %d es primo.\n", num);
        else
            System.out.printf("El número %d NO es primo.\n", num);

    }

}
