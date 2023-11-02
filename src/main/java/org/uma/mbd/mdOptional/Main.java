package org.uma.mbd.mdOptional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> s = Optional.of("Hola");
        prueba(s);
        Optional<Integer> oi = Optional.of(45);
        prueba(oi);
        Optional<Integer> o2 = Optional.empty();
        prueba(o2);
    }

    public static <T> void prueba(Optional<T> o) {
        if (o.isPresent()){
            System.out.println(o.get());
        }
        else{
            System.out.println("No hay nada");
        }

    }
}
