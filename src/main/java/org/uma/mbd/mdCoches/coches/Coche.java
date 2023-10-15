package org.uma.mbd.mdCoche;

public class Coche {
    private String nombre;
    private double precio;
    static private double PIVA = 16;

    public Coche(String n, double p){
        nombre = n;
        precio = p;
    }
    public static void setPiva(double nIVA){
        PIVA = nIVA;
    }
    public double precioTotal(){
        return precio + PIVA/100 * precio;
    }
    @Override
    public String toString(){
        return nombre + " -> " + precioTotal();
    }

}