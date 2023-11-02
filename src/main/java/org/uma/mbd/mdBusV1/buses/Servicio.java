package org.uma.mbd.mdBusV1.buses;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;



public class Servicio {
    private String ciudad;
    private List<Bus> buses;

    public Servicio(String c) {
        ciudad = c;
        buses = new ArrayList<Bus>();
    }

    public String getCiudad() {
        return ciudad;
    }

    private List<Bus> getBuses() {
        return buses;
    }

    public void leeBuses(String file) throws IOException {
        int codBus;
        String matricula;
        Bus bus;
        for (String archivo : Files.readAllLines(Paths.get(file))) {
            try (Scanner scLinea = new Scanner(archivo)) {
                scLinea.useDelimiter("[,]+");
                //Asignación
                codBus = scLinea.nextInt();
                matricula = scLinea.next();
                bus = new Bus(codBus, matricula);
                bus.setCodLinea(scLinea.nextInt());

                buses.add(bus);
            } catch (InputMismatchException e) {
                System.err.println("Error de entrada en " + archivo);
            }
            catch (NoSuchElementException e) {
                System.err.println("Error de formato en " + archivo);
            }
        }
    }

    public List<Bus> filtra(Criterio criterio) {
        return buses.stream()
                .filter(bus -> criterio.esSeleccionable(bus))
                .toList();
    }

    public void guarda(PrintWriter pw, Criterio criterio) {
        pw.println(criterio);
        List<Bus> busesFiltrados = filtra(criterio);
        for (Bus busF : busesFiltrados) {
            pw.println(busF);
        }
    }

    public void guarda(String file, Criterio criterio) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(file)) {
            guarda(pw, criterio);
        } catch (IOException e) {
            System.err.println("Ha habido un error con el fichero");
        }
    }
}