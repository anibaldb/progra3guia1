package com.facultad.ejercicios;

import java.util.List;

public class Ejercicio12 {

    public static void ejecutar() {
        List<String> nombres = List.of("juan","ana","pedro","lucas","ana");

        String nombresMasLargo= nombres.stream()
                .reduce("",(a,b) -> a.length() >= b.length() ? a : b);

        System.out.println("El nombre más largo es: " + nombresMasLargo);
    }
}
