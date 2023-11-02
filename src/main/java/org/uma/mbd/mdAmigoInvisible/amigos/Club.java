package org.uma.mbd.mdAmigoInvisible.amigos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Club {
    protected static List<Persona> socios;

    public Club(){
        socios = new ArrayList<>();
    }

    public void lee(String fEntrada, String delim) throws IOException{
        for (String linea : Files.readAllLines(Paths.get(fEntrada))) {
            leeSocios(linea,delim);
        }
    }

    private void leeSocios(String linea, String delim){
        try (Scanner scLinea = new Scanner(linea)) {
            scLinea.useDelimiter(delim);
            //Asignación
            while(scLinea.hasNext()){
                creaSocioDesdeString(scLinea.next());
            }
        } catch (InputMismatchException e) {
            System.err.println("Error de entrada en " + linea);
        }
        catch (NoSuchElementException e) {
            System.err.println("Error de formato en " + linea);
        }
    }

    protected void creaSocioDesdeString(String nombre){

        socios.add(new Persona(nombre));

    }

    protected void hacerAmigos(){
        List<Integer> posAmigos = new ArrayList<>();
        for(int i = 0; i < socios.size(); i++){
            posAmigos.add(i);
        }

        while(hayCoincidencias(posAmigos)) {  //Si es cierto, significa que alguna posición coincide con su valor
            Collections.shuffle(posAmigos);
        }

        for(int i = 0; i < socios.size(); i++){ //Asignamos a cada socio su amigo invisible
            socios.get(i).setAmigo(socios.get(posAmigos.get(i)));
        }
    }

    private static boolean hayCoincidencias(List<Integer> posAmigos){
        for(int i = 0; i < posAmigos.size();i++){
            if (posAmigos.get(i) == i){
                return true;
            }
        }
        return false; //Devuelve false si ningun indice ha sido igual a su valor
    }

    public void presentaAmigos(String fSalida) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(fSalida)) {
            presentaAmigos(pw);
        } catch (IOException e) {
            System.err.println("Ha habido un error con el fichero");
        }
    }
    public void presentaAmigos(PrintWriter pw){
        Collections.sort(socios);
        for (Persona socio : socios) {
            pw.println(socio);
        }
    }
}
