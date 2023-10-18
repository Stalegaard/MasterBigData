package org.uma.mbd.mdLibreriaV3L.libreria;

public class LibroEnOferta extends Libro {

    private double descuento;
    public LibroEnOferta(String au, String ti, double pb, double d) {
        super(au, ti, pb);
        descuento = d;
    }

    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioFinal() {
        double pf = super.getPrecioFinal();
        return pf - pf*descuento/100;
    }
    @Override
    public String toString() {
        return "(" + getAutor() + ";" + getTitulo() + ";" + getPrecioBase() + ";" + descuento + "%;"
                + (getPrecioFinal()*(1-descuento/100)) + ";" + getIVA() + ";" + getPrecioFinal() +")";
    }
}
