package com.facultad.ejercicios;

import com.facultad.modelo.Datos;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio14 {
    public static void ejecutar(){

        Map<Boolean, List<Integer>> numerosAgrupados = Datos.numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Los números agrupados entre pares e impares son: " + numerosAgrupados);
    }
}
