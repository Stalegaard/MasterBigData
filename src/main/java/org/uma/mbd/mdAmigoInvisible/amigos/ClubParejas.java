package org.uma.mbd.mdAmigoInvisible.amigos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ClubParejas extends Club{
    protected static Set<Pareja> parejas;

    public ClubParejas(){
        parejas = new HashSet<>();
    }

    @Override
    protected void creaSocioDesdeString(String nombre){
        if(nombre.contains("-")){
            var p = nombre.split("-");
            parejas.add(new Pareja(new Persona(p[0]),new Persona(p[1])));
            socios.add(new Persona(p[0]));
            socios.add(new Persona(p[1]));
        }
        else{
            socios.add(new Persona(nombre));
        }

    }

    @Override
    protected void hacerAmigos(){
        List<Integer> posAmigos = new ArrayList<>();
        for(int i = 0; i < socios.size(); i++){
            posAmigos.add(i);
        }

        while(hayCoincidencias(posAmigos) || hayParejas(posAmigos)) {  //Si es cierto, significa que alguna posición coincide con su valor
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

    private static boolean hayParejas(List<Integer> posAmigos){
        for(int i = 0; i < posAmigos.size();i++){
            Pareja pareja = new Pareja( socios.get(i), socios.get(posAmigos.get(i)));
            if(parejas.contains(pareja)) {
                return true;
            }
        }
        return false; //Devuelve false si ningun indice ha sido igual a su valor
    }

}
