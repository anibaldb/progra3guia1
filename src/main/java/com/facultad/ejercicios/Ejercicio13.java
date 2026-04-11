package com.facultad.ejercicios;

import com.facultad.modelo.Datos;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio13 {

    public static void ejecutar(){



        String texto = Datos.numeros.stream()
            .map(String::valueOf) // Convertir cada número a String
            .collect(Collectors.joining(" - " ));

        System.out.println(texto);


    }
}
