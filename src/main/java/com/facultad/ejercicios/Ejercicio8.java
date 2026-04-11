package com.facultad.ejercicios;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Ejercicio8 {

    public static void ejecutar(){

        List<String> nombres = List.of("juan","ana","pedro","lucas","ana");


        List<String> obtenerNombresSinDuplicados = nombres.stream()
                .distinct()
                .toList();

        System.out.println("Los nombres sin duplicados son: " + obtenerNombresSinDuplicados);


    }





}
