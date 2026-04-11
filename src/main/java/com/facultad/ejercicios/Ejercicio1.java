package com.facultad.ejercicios;

import java.util.List;

public class Ejercicio1 {

    //1. Filtrar números pares
    //○ Dada una lista de números enteros, utiliza filter para
    //obtener solo los números pares y guárdalos en una nueva
    //lista

    public static void ejecutar(){
        List <Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> pares = numeros.stream()
            .filter(n -> n % 2 == 0)
            .toList();

        System.out.println("Los números pares son: " + pares);


    }
}
