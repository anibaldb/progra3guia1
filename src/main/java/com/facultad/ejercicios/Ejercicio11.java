package com.facultad.ejercicios;

import java.util.List;

public class Ejercicio11 {

    //11. Encontrar el producto de todos los números de una lista
    //● Usa reduce para calcular el producto de todos los
    //números de una lista

    public static void ejecutar() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long producto = numeros.stream()
            .reduce(1, (a, b) -> a * b);

        System.out.println("El producto de los números es: " + producto);


    }
}
