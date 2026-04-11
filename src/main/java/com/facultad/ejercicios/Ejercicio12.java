package com.facultad.ejercicios;

import java.util.List;

public class Ejercicio12 {

    //12. Obtener el nombre más largo de una lista
    //● Usa reduce para encontrar el nombre con más caracteres
    //en una lista de nombres.


    public static void ejecutar() {
        List<String> nombres = List.of("juan","ana","pedro","lucas","ana");

        String nombresMasLargo= nombres.stream()
                .reduce("",(a,b) -> a.length() >= b.length() ? a : b);

        System.out.println("El nombre más largo es: " + nombresMasLargo);
    }
}
