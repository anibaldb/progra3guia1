package com.facultad.ejercicios;

import java.util.List;

public class Ejercicio9 {

    //9. Obtener los 3 números más grandes de una lista
    //○ Usa sorted y limit para encontrar los 3 números más
    //grandes en una lista de enteros.

    public static void ejecutar(){



        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        List<Integer> tresMasGrandes = numeros.stream()
            .sorted((a, b) -> b - a) // Ordenar de mayor a menor
            .limit(3) // Tomar los primeros 3 elementos
            .toList();

        System.out.println("Los tres números más grandes son: " + tresMasGrandes);


    }
}
