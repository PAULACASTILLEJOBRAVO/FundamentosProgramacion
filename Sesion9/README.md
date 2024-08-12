# Sesion 9

## Ejemplos

1. Escriba un método recursivo que calcule la potencia n de un número x. Use este método en un programa que lea el valor de x y de n y calcule e imprima por pantalla el resultado de la potencia.

[Potencia.java](Potencia.java).

## Enunciado

1. Diseñar un algoritmo recursivo para sumar los n primeros números enteros, sumaRecursiva(n): 

a) Si n es 1, la suma es 1. 

b) Si n es mayor que 1 entonces será: n + sumaRecursiva(n-1).

- Escriba un programa recursivo en Java que nos pida un número y calcule la suma de los n primeros números.
   
2. Sea el siguiente algoritmo propuesto por Euclides en sus Elementos, libro séptimo, para determinar el máximo común divisor de dos enteros, n y m, tal que n < m: 

a) Tómese el resto del cociente m/n

b) Si el resto es cero, entonces n es el máximo común divisor.

c) Si el resto es distinto de cero se hace m = n y n = resto.

d) Se vuelve al punto a).

- Escriba un programa recursivo que acepte dos números enteros leídos por teclado y determine su máximo común divisor aplicando el algoritmo de Euclides. Escriba un método que aplique el algoritmo.
   
3. Construir un programa que obtenga el término n de la serie de Fibonacci. El valor de n deberá leerse por teclado usando la clase Scanner. La serie de Fibonacci es una secuencia de enteros positivos, cada uno de los cuales es la suma de los dos anteriores. Los dos primeros números de la secuencia son 0 y 1.

- La serie se define como: 

a) Fibonacci = n para n <= 1.

b) Fibonaccin = Fibonaccin - 1 + Fibonaccin - 2 para todo n > 1. 

- El programa tendrá, además del método main, un método recursivo para calcular dicho término. El método main deberá llamar al método e imprimir, usando printf, el término n de la serie. Si el usuario introduce un valor negativo, el programa debe emitir un aviso.

## Entrega

[SumaNPrimerosNumeros.java](SumaNPrimerosNumeros.java).

[ComunDivisor.java](ComunDivisor.java).

[Fibonacci.java](Fibonacci.java).