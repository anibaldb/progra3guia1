package com.facultad.ejercicios;

import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

    public static void ejecutar(){

        List<Integer> numeros = List.of(2,1,3,5,4,6,10,8,9,7);

        List<Integer> ordenados = numeros.stream()
            .sorted()
            .toList();
        System.out.println("Los ordenados son: " + ordenados);

    }
}
