package org.uma.mbd.mdAlturas.alturas;

import org.uma.mbd.mdBusV1.buses.Bus;

public class MayoresQue implements Seleccion{
    private double alturaMin;
    public MayoresQue(double a){
        alturaMin = a;
    }

    @Override
    public boolean test(Pais pais) {
        return pais.altura() > alturaMin;
    }

}
