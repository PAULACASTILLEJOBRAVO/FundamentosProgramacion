package Sesion2;

import java.util.Locale;
import java.util.Scanner;

public class Segundos {
    
    public static void main(String[] args) {
        
        // Declaración de variables
        int seconds, minutes, hours, days;
        final int SECONDS_MINUTE = 60;
        final int SECONDS_HOUR = 60 * SECONDS_MINUTE;
        final int SECONDS_DAY = 24 * SECONDS_HOUR;
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);

        // Entrada de datos
        System.out.println("Introduzca los segundos:");
        seconds = leer.nextInt();

        // Aplicación del algoritmo de conversión        
        days = seconds / SECONDS_DAY;
        hours = (seconds % SECONDS_DAY) / SECONDS_HOUR;
        minutes = (seconds % SECONDS_HOUR) / SECONDS_MINUTE;
        seconds = seconds % SECONDS_MINUTE;

        // Salida de información
        System.out.printf(Locale.US, "%d días, %d horas, %d minutos y %d segundos. \n", days, hours, minutes, seconds);

    }

}
