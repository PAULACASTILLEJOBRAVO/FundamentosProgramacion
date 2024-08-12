package Sesion9;

import java.util.Scanner;

public class Potencia {
    
    public static void main(String [ ] args) {
        
        Scanner leer=new Scanner (System.in);
        
        int x, n, potencia;
        
        System.out.println ("Introducir el numero x: ") ;
        x = leer.nextInt();
        
        System.out.println ("Introducir la potencia: ") ;
        n = leer.nextInt(); 
        
        potencia = calcular_potencia(x,n);
        
        System.out.printf("La potencia de %d elevado a %d es %d\n", x, n, potencia); 
        System.out.println("La potencia con Math.pow(x,n) es:" + Math.pow(x, n)); 

    } 

    public static int calcular_potencia(int x, int n){

        int valor = 1; 

        if (n > 0)  
            valor = x * calcular_potencia(x, n - 1);

        return valor;

    }

}
