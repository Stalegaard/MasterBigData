package org.uma.mbd.mdAlturasV2.alturas;

public class MayoresQue implements Seleccion {
    private double alturaMin;
    public MayoresQue(double a){
        alturaMin = a;
    }

    @Override
    public boolean test(Pais pais) {
        return pais.altura() > alturaMin;
    }

}
