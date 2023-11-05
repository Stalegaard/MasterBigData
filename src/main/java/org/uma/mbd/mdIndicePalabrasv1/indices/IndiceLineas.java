package org.uma.mbd.mdIndicePalabrasv1.indices;

import java.util.*;
import java.util.stream.Collectors;

public class IndiceLineas extends Indice{
    Map<String,Set<Integer>> palabras;

    public IndiceLineas(){
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
        for (String linea: texto) {
            Scanner scLinea = new Scanner(linea);
            scLinea.useDelimiter(delimitadores);

            //Recorremos la línea buscando palabras y sólo guardamos la primera si no está dentro de no significativas

            while(scLinea.hasNext()){
                String palabraNueva = scLinea.next().toLowerCase();
                if(!noSignif.contains(palabraNueva)){
                    palabras.computeIfAbsent(palabraNueva,key -> new TreeSet<>()).add(contLinea);
                }
            }
            contLinea++;
        }
    }

    @Override
    public void presentarIndiceConsola() {
        for (String palabra : palabras.keySet()) {
            System.out.printf("%-30s", palabra);
            for (int linea : palabras.get(palabra)) {
                System.out.printf("%d.", linea);
            }
            System.out.println();
        }
    }
}
