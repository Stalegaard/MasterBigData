package org.uma.mbd.mdAlturasV2.alturas;

public class MenoresQue implements Seleccion {
    private double alturaMax;
    public MenoresQue(double a){
        alturaMax = a;
    }

    @Override
    public boolean test(Pais pais) {
        return pais.altura() < alturaMax;
    }
}

