package com.facultad.ejercicios;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio10 {

    //10. Agrupar palabras por su longitud
    //○ Usa Collectors.groupingBy para agrupar una lista de
    //palabras según su cantidad de caracteres.

    public static void ejecutar(){
        List<String> nombres = List.of("juan","ana","pedro","lucas","ana");

        Map<Integer,List<String>> nombresPorLongitud = nombres.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Los nombres agrupados por longitud son: " + nombresPorLongitud);



    }
}
