package com.facultad.ejercicios;

import java.util.List;

public class Ejercicio6 {

    public static void ejecutar(){
        List<String> nombres = List.of("juan","ana","pedro","lucas","ana");

        List<Integer> longitudes= nombres.stream()
                .map(String::length)
                .toList();

        System.out.println("Las longitudes de los nombres son: " + longitudes);

    }
}
