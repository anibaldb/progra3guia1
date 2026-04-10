package com.facultad.ejercicios;

import java.util.List;

public class Ejercicio2 {

    public static void ejecutar(){
        List<String> nombres = List.of("juan","ana","pedro","lucas","ana");

        List <String> mayusculas = nombres.stream()
                .map(String::toUpperCase)
                .toList();

    }



}
