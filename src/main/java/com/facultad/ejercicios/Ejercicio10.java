package com.facultad.ejercicios;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio10 {

    public static void ejecutar(){
        List<String> nombres = List.of("juan","ana","pedro","lucas","ana");

        Map<Integer,List<String>> nombresPorLongitud = nombres.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println();


    }
}
