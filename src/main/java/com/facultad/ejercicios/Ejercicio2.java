package com.facultad.ejercicios;

import java.util.List;

public class Ejercicio2 {

    //2. Transformar una lista de nombres a mayúsculas
    //○ Usa map para convertir cada nombre de una lista en su
    //versión en mayúsculas.

    public static void ejecutar(){


        List<String> nombres = List.of("juan","ana","pedro","lucas","ana");

        List <String> mayusculas = nombres.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("Los nombres en mayúsculas son: " + mayusculas);

    }




}
