package org.uma.mbd.mdAmigoInvisible.amigos;

import java.util.Objects;
public class Persona implements Comparable<Persona>{
    private String nombre;
    private Persona amigo;

    public Persona(String n){
        nombre = n;
    }
    public void setAmigo(Persona am){
        amigo = am;
    }
    public String getNombre(){
        return nombre;
    }
    public Persona getAmigo(){
        return amigo;
    }
    @Override
    public boolean equals(Object o) {
        return (o instanceof Persona p)
                && (p.nombre.equalsIgnoreCase(nombre));
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase());
    }
    @Override
    public int compareTo(Persona p) {
        return nombre.compareTo(p.nombre);
    }
    @Override
    public String toString() {
        if (amigo.getNombre().isEmpty()){
            return nombre + " -> sin amigo";
        }
        return nombre + " -> " + amigo.nombre;
    }
}
