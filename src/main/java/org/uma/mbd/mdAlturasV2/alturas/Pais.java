package org.uma.mbd.mdAlturasV2.alturas;


public record Pais(String nombre, String continente, double altura) implements Comparable<Pais>{
    @Override
    public int compareTo(Pais p) {
        int resultado = Double.compare(altura,p.altura);
        if (resultado == 0){
            resultado =  nombre.compareTo(p.nombre);
        }
        return resultado;
    }
}
