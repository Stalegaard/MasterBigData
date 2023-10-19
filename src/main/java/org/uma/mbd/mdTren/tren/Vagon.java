package org.uma.mbd.mdTren;

public class Vagon {
    private int carga;

    public int carga(int ton){
        carga = ton;

        return ton - carga;
    }
}
