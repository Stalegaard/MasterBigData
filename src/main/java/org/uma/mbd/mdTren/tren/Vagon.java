package org.uma.mbd.mdTren.tren;

public class Vagon {
    private int capacidad;
    private int carga;

    public Vagon(int c){
        capacidad = c;
        carga = 0;
    }

    public int carga(int ton){

        if (carga + ton > capacidad){
            ton = ton - (capacidad - carga) ;
            carga = capacidad;
            return ton;
        }
        else{
            carga += ton;
            return 0;
        }
    }
    public int descarga(int ton){
        if (carga - ton < 0){
            ton -= carga;
            carga = 0;
            return ton;
        }
        else{
            carga -= ton;
            return 0;
        }
    }
    public int getCarga(){
        return carga;
    }
    public int getCapacidad(){
        return capacidad;
    }
    @Override
    public String toString(){
        return "V(" + carga + "/ "+capacidad+")";
    }
}

