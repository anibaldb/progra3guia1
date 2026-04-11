package com.facultad.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {

    //5. Obtener los primeros 5 elementos de una lista
    //○ Usa limit para extraer solo los primeros 5 elementos de
    //una lista de números.

    public static void ejecutar(){
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> primerosCinco = numeros.stream()
            .limit(5)
            .toList();

        System.out.println("Los primeros 5 números son: " + primerosCinco);
    }
}
