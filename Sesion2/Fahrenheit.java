package Sesion2;

import java.util.Locale;
import java.util.Scanner;

public class Fahrenheit {
    
    public static void main(String[] args) {
        
        // Declaración de variables
        double grados_C, grados_F;
        final double NUEVE_QUINTOS = 9.0 / 5.0;
        final double TREINTAYDOS = 32.0;
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);

        // Entrada de datos
        System.out.println("Introduzca la temperatura en grados centigrados:");
        grados_C = leer.nextDouble();

        // Aplicación del algoritmo de conversión
        grados_F = grados_C * NUEVE_QUINTOS + TREINTAYDOS;

        // Salida de información
        System.out.printf(Locale.US, "La temperatura en Fahrenheit es: %8.2f F\n", grados_F);

    }
}
