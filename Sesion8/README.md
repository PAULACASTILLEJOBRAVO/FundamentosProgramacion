# Sesión 8

## Ejemplos

1. Construya en Java un programa que lee por teclado alias de jugadores y los escribe en un fichero de forma secuencial, con un alias por línea.

[EscribirJugador.java](EscribirJugador.java).

2. Construya en Java un programa que lee de un fichero alias de jugadores y los muestra por pantalla.

[LeerJugador.java](LeerJugador.java).

## Enunciado

1. Se pide modificar el ejemplo del programa de escritura/lectura de un fichero secuencial para: 

- Escribir alias de jugadores. Para cada alias el programa genera una puntuación. 

- La puntuación será un valor entero generado aleatoriamente (0 – 999999).

- Cada línea del fichero contendrá un par alias puntuación:

Pepe;1234
MAría;4567

- Leer las parejas de valores alias;puntación y mostrarlas por pantalla de la forma:

>Pepe = 1234
>María = 4567

- Indicar cual de los alias introducidos en el fichero tiene la puntuación más alta.

2. Generar un fichero que llamaremos numeros.dat con 2000 números enteros entre 0 y 999.999.

- Leer los números del fichero numeros.dat y generar un fichero con los números del fichero numeros.dat que son primos, estos números se guardan en el nuevo fichero llamado primos.dat.

- Para la realización del ejercicio crea un método o función booleano que le pasemos un número y devuelva true si el número es primo y false en caso contrario.

## Entrega

[AliasPuntación.java](AliasPuntación.java).

[Numeros.java](Numeros.java).