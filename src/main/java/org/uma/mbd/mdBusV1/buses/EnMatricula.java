package org.uma.mbd.mdBusV1.buses;

public class EnMatricula implements Criterio{

    private String dato;

    public EnMatricula(String d){
        dato = d;
    }
    @Override
    public boolean esSeleccionable(Bus bus) {
        return bus.getMatricula().contains(dato);
    }
    @Override
    public String toString() {
        return "Autobuses cuya matrícula contiene " + dato;
    }
}
