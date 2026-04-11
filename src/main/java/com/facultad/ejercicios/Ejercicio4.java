package com.facultad.ejercicios;

import java.util.List;

public class Ejercicio4 {

    //4. Contar elementos mayores a un valor dado
    //○ Dada una lista de números, usa filter y count para
    //contar cuántos valores son mayores que 7.

    public static void ejecutar(){
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long cantidad = numeros.stream()
                .filter(n -> n>7)
                .count();

        System.out.println("La cantidad de números mayores a 7 es: " + cantidad);
    }
}
