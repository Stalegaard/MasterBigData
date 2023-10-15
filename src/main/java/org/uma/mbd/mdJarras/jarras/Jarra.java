package org.uma.mbd.PrimeraRelacion.mdJarras.jarras;

import java.util.Objects;

public class Jarra {
    private final int capacidad;
    private int contenido;

    public Jarra(int capInicial){
        if(capInicial <= 0){
            throw new IllegalArgumentException("No se puede crear una jarra con capacidad inicial"+capInicial);
        }
        capacidad = capInicial;
        contenido = 0;
    }

    public void llena(){
        contenido = capacidad;
    }

    public void vacia(){
        contenido = 0;
    }

    public void llenaDesde(Jarra j){
        if ( this == j){
            throw new IllegalArgumentException("No se puede volcar una jarra sobre sí misma");
        }
        Objects.requireNonNull(j,"La jarra no existe");
        int cabe = capacidad - contenido;
        if (cabe >= j.contenido){
            contenido += j.contenido;
            j.vacia();
        }
        else{
            llena();
            j.contenido -= cabe;
        }
    }

    public int getContenido() { return contenido;}

    public int getCapacidad() { return capacidad;}

    @Override
    public String toString(){
        return "J(" + capacidad + ", "+contenido+")";
    }
}
