package org.uma.mbd.mdLibreriaV3L.libreria;

public class OfertaPrecio implements OfertaFlex{
    private double descuento;
    private double umbral;
    public OfertaPrecio(double d, double u){
        descuento = d;
        umbral = u;
    }
    @Override
    public double getDescuento(Libro libro){
        double des = 0;
        if(libro.getPrecioBase() >= umbral){
            des = descuento;
        }
        return des;
    }
    @Override
    public String toString(){
        return descuento + "%("+umbral+")";
    }
}
