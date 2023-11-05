package org.uma.mbd.mdIndicePalabrasv1.indices;

import java.util.*;
import java.util.stream.Collectors;

public class IndicePosicionesEnLineas extends Indice{
    Map<String, Map<Integer, Set<Integer>>> palabras;

    public IndicePosicionesEnLineas(){
        super();
        palabras = new TreeMap<>();
    }
    public void agregarLinea(String linea) {
        super.agregarLinea(linea);
        palabras.clear();
    }
    @Override
    public void resolver(String delimitadores, Collection<String> noSignificativas) {
        Set<String> noSignif =noSignificativas.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        int contLinea=1;
        int contPal=1;
        for (String linea: texto) {
            Scanner scLinea = new Scanner(linea);
            scLinea.useDelimiter(delimitadores);

            //Recorremos la línea buscando palabras y sólo guardamos la primera si no está dentro de no significativas

            while(scLinea.hasNext()){
                String palabraNueva = scLinea.next().toLowerCase();
                if(!noSignif.contains(palabraNueva)){
                    palabras.computeIfAbsent(palabraNueva,key -> new TreeMap<>()).computeIfAbsent(contLinea,key -> new TreeSet<>()).add(contPal);
                }
                contPal++;
            }
            contLinea++;
            contPal = 1; //Reseteamos el contador de palabras por línea
        }
    }

    @Override
    public void presentarIndiceConsola() {
        for (String palabra : palabras.keySet()) {
            System.out.println(palabra);
            for (int linea : palabras.get(palabra).keySet()) {
                System.out.printf("%20s    ", linea);
                for (int pal : palabras.get(palabra).get(linea)) {
                    System.out.printf("%d.", pal);
                }
                System.out.println();
            }
        }
    }

}
