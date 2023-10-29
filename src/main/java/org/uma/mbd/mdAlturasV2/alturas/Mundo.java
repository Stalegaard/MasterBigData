package org.uma.mbd.mdAlturas.alturas;
import org.uma.mbd.mdBusV1.buses.Bus;
import org.uma.mbd.mdBusV1.buses.Criterio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class Mundo {
    private List<Pais> paises;

    public List<Pais> getPaises(){
        return paises;
    }
    public void leePaises(String file) throws IOException {
        paises = new ArrayList<Pais>();
        String nombre;
        String continente;
        double altura;
        for (String archivo : Files.readAllLines(Paths.get(file))) {
            try (Scanner scLinea = new Scanner(archivo)) {
                scLinea.useDelimiter("[,]+");
                //Asignación
                nombre = scLinea.next();
                continente = scLinea.next();
                altura = scLinea.useLocale(Locale.US).nextDouble();
                Pais pais = new Pais(nombre, continente, altura);

                paises.add(pais);
            } catch (InputMismatchException e) {
                System.err.println("Error de entrada en " + archivo);
            }
            catch (NoSuchElementException e) {
                System.err.println("Error de formato en " + archivo);
            }
        }
    }
    public List<Pais> selecciona(Seleccion sel){
        return paises.stream()
                .filter(pais -> sel.test(pais))
                .toList();
    }
}

