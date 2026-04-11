package com.facultad.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {

    public static void ejecutar(){
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> primerosCinco = numeros.stream()
            .limit(5)
            .toList();

        System.out.println("Los primeros 5 números son: " + primerosCinco);
    }
}
