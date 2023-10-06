package org.uma.mbd.mdJarras.jarras;

public class Jarra {
    private int capacidad;
    private int contenido;

    public Jarra(int capInicial){
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

    @Override
    public String toString(){
        return "J(" + capacidad + ", "+contenido+")";
    }
}
