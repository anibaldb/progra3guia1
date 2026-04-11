package com.facultad.ejercicios;

import com.facultad.modelo.Datos;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio13 {

    //13. Convertir una lista de enteros en una cadena separada
    //por guiones
    //● Usa map y Collectors.joining para convertir una lista
    //de enteros en una cadena con valores separados por -.

    public static void ejecutar(){



        String texto = Datos.numeros.stream()
            .map(String::valueOf) // Convertir cada número a String
            .collect(Collectors.joining(" - " ));

        System.out.println(texto);


    }
}
