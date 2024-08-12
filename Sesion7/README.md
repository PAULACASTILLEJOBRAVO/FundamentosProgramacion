# Sesión 7

# Ejemplos

1. Construya en Java dos métodos que reciban como único parámetro una matriz de enteros. El primer método debe devolver la media aritmética de los enteros de la matriz. El segundo método debe devolver el valor máximo de la matriz. Construya un programa principal que lea una matriz de enteros, invoque a ambos métodos e imprima los valores devueltos.

[MediaMaximo.java](MediaMaximo.java).

2. Queremos añadir una nueva funcionalidad para calcular la media de forma diferente. Se calculará sólo para los números mayores a un numero dado.

[MediaModificado.java](MediaModificado.java).

3. Escriba un programa que genere un boleto de lotería primitiva con el número de apuestas elegido por el usuario. 

- El programa hará uso del concepto de modularización, conteniendo los métodos necesarios para la generación del boleto. 

- En el método main se leerá el número de apuestas con la clase Scanner y se imprimirá el boleto (números de cada apuesta, reintegro y precio) con printf. 

- Un boleto de lotería primitiva se compone de n apuestas de 6 números enteros elegidos al azar en el intervalo de 1 a 49 y un reintegro elegido al azar entre 0 y 9. 

- El coste de cada apuesta es de 1 euro.

[Primitiva.java](Primitiva.java).

# Enunciado

Escriba un programa calcule las combinaciones de la primitiva, teniendo en cuenta que son combinaciones de 49 elementos sin repetición tomados de 6 en 6. Es decir sería el número combinatorio: C(49,6).

- Deberemos crear la función factorial, teniendo en cuenta que el factorial de un número es ese número multiplicado por todos los menores que él, y que el factorial de = es 1. el factorial de n se representa como n!

- La fórmula que me calcula el número combinatorio c(n,k) es la siguiente: 

$$ c(n, k) = \frac{n!}{k! (n - k)!} =  \binom{n}{k}$$

con k <= n

- Debemos diseñar una función que calcule el valor de un número combinatorio. Y usar esa función para resolver el problema del número de combinaciones de lotería primitiva posibles.

# Entrega

[CoeficienteBinomial.java](CoeficienteBinomial.java).