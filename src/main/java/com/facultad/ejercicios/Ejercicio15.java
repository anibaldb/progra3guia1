package com.facultad.ejercicios;

import com.facultad.modelo.Datos;

public class Ejercicio15 {

    public static void ejecutar(){

        int sumaCuadradosNrosImpares = Datos.numeros.stream()
                .filter(n -> n % 2 != 0) // Filtrar solo los números impares
                .map(n -> n * n) // Elevar al cuadrado cada número impar
                .reduce(0, Integer::sum); // Sumar todos los cuadrados

        System.out.println("La suma de los cuadrados de los números impares es: " + sumaCuadradosNrosImpares);
    }
}
