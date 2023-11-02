package org.uma.mbd.mdBusV1;

import org.uma.mbd.mdBusV1.buses.Servicio;

import java.io.IOException;

public class MainPrueba {
    public static void main(String[] args) throws IOException {
        Servicio servicio = new Servicio("Malaga");
        String rutaBuses = "./recursos/recursos/mdBusV1/buses.txt";
        servicio.leeBuses(rutaBuses);
    }
}
