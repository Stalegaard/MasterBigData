package org.uma.mbd.mdAlturas.alturas;

import org.uma.mbd.mdBusV1.buses.Bus;

public class EnContinente implements Seleccion{
    private String texto;

    public EnContinente(String t){
        texto = t;
    }
    @Override
    public boolean test(Pais pais) {
        return pais.continente().contains(texto);
    }
}
