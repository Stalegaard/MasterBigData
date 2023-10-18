package org.uma.mbd.mdCoches.coches;

public class Coche {
    private String nombre;
    private double precio;
    static private double PIVA = 0.16;

    public Coche(String n, double p){
        nombre = n;
        precio = p;
    }
    public static void setPiva(double nIVA){
        PIVA = nIVA;
    }
    public double precioTotal(){
        return precio + PIVA * precio;
    }
    @Override
    public String toString(){
        return nombre + " -> " + precioTotal();
    }

}