package com.facultad.ejercicios;

import java.util.List;

public class Ejercicio6 {

    //6. Convertir una lista de palabras en su longitud
    //○ Usa map para transformar una lista de palabras en una
    //lista con la longitud de cada palabra.

    public static void ejecutar(){
        List<String> nombres = List.of("juan","ana","pedro","lucas","ana");

        List<Integer> longitudes= nombres.stream()
                .map(String::length)
                .toList();

        System.out.println("Las longitudes de los nombres son: " + longitudes);

    }
}
