package com.facultad.ejercicios;

import java.util.List;

public class Ejercicio7 {

    public static void ejecutar(){
        List<String> nombres = List.of("juan","ana","pedro","lucas","ana");

        String resultado= nombres.stream()
                .reduce("", (x, y) -> x.isEmpty() ? y : x+" - "+y);

        System.out.println(resultado);
    }

}
