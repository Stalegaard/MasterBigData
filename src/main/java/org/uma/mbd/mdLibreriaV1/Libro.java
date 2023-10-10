package org.uma.mbd.mdLibreriaV1;

public class Libro {
    private String autor;
    private String titulo;
    private double precioBase;
    private static double IVA = 10;

    public Libro(String au, String ti, double pb){
        autor = au;
        titulo = ti;
        precioBase = pb;
    }

    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public static void setIVA(double IVA) {
        Libro.IVA = IVA;
    }

}