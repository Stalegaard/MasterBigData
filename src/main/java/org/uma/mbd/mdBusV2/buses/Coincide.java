package org.uma.mbd.mdBusV2.buses;

public class Coincide implements Criterio {
    private Bus bus;

    public Coincide(Bus b){
        bus = b;
    }

    @Override
    public boolean esSeleccionable(Bus busComp) {
        return bus.equals(busComp);
    }
    @Override
    public String toString() {
        return "Autobus " + bus;
    }
}
