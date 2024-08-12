package Sesion7;

import java.util.Scanner;

public class MediaMaximo {
 
    public static void main(String[] args) {
        int[] matriz = null;
        int n, maximo, media;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduzca la longitud de la matriz: ");
        n = leer.nextInt();
        
        matriz = new int[n];

        System.out.println("\nIntroduzca los valores de la matriz separados por blancos ");
        
        for (int i = 0; i < n; i++) 
            matriz[i] = leer.nextInt();
        
        media = media(matriz);
        maximo = maximo(matriz);

        System.out.println("\nLa media es: " + media);
        System.out.println("El maximo es: " + maximo);
    }

    public static int media(int[] matriz) {
        
        int valor = 0;

        for (int i = 0; i < matriz.length; i++) 
            valor = valor + matriz[i]; 

        valor = valor / matriz.length;
    
        return valor; 
    
    }
    
    public static int maximo(int[] matriz) {

        int valor = matriz[0];
        
        for (int i = 1; i < matriz.length; i++) 
            if (valor < matriz[i]) 
               valor = matriz[i];  
    
        return valor; 
        
    }

}
