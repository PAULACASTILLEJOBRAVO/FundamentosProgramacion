package Sesion7;

import java.util.Scanner;

public class MediaModificado {
    
    public static void main(String[] args) {
        
        int[] matriz = null;
        int n, maximo, media, mediaPositivos;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduzca la longitud de la matriz: ");
        n = leer.nextInt();
        
        matriz = new int[n];
        
        System.out.println("\nIntroduzca los valores de la matriz separados por blancos ");
        
        for (int i = 0; i < n; i++) 
            matriz[i] = leer.nextInt();

        media = media(matriz);
        mediaPositivos = media(matriz, 0);
        maximo = maximo(matriz);

        System.out.println("\nLa media es: " + media);
        System.out.println("La media de valores positivos es: " + mediaPositivos);
        System.out.println("El maximo es: " + maximo);
    
    }

    public static int media(int[] matriz) {
    
        int valor = 0;
    
        for (int i = 0; i < matriz.length; i++) 
            valor = valor + matriz[i]; 
    
        valor = valor / matriz.length;
    
        return valor; 
    
    }
    
    public static int media(int[] matriz, int limite) {

        int valor = 0;
        int totalElementos = 0;

        for (int i = 0; i < matriz.length; i++) 
            if(matriz[i] >= limite) {
                
                valor = valor + matriz[i];
                totalElementos ++; 
            
            } 
    
        valor = valor / totalElementos;
    
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
