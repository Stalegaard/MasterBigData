package org.uma.mbd.mdAlturasV2.alturas;

public class EnContinente implements Seleccion {
    private String texto;

    public EnContinente(String t){
        texto = t;
    }
    @Override
    public boolean test(Pais pais) {
        return pais.continente().contains(texto);
    }
}
