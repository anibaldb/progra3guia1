package com.facultad.ejercicios;

import java.util.List;

public class Ejercicio7 {

    //7. Concatenar nombres con una separación
    //○ Dada una lista de nombres, usa reduce para
    //concatenarlos en un solo String separados por comas.

    public static void ejecutar(){
        List<String> nombres = List.of("juan","ana","pedro","lucas","ana");

        String resultado= nombres.stream()
                .reduce("", (x, y) -> x.isEmpty() ? y : x+" - "+y);

        System.out.println(resultado);
    }

}
