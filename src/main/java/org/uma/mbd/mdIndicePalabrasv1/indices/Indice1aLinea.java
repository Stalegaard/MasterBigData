package org.uma.mbd.mdIndicePalabrasv1.indices;
import java.util.*;
import java.util.stream.Collectors;

public class Indice1aLinea extends Indice{
    Map<String,Integer> palabras;

    public Indice1aLinea(){
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
                if(!noSignif.contains(palabraNueva) && !palabras.containsKey(palabraNueva)){//comprobamos que sea significativa y además, que no esté ya guardado
                    palabras.put(palabraNueva,contLinea);
                }
            }
            contLinea++;
        }
    }

    @Override
    public void presentarIndiceConsola() {
        for (String palabra: palabras.keySet()) {
            System.out.printf("%-30s%d\n",palabra,palabras.get(palabra));
        }
    }
}
