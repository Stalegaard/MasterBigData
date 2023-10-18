package org.uma.mbd.mdLibreriaV2L.libreria;

public class LibreriaOferta extends Libreria{
    private double descuento;
    private String[] autoresEnOferta;
    public LibreriaOferta(double d, String [] aeo){
        //super(); No es necesario poner nada porque solo ya llama al super sin argumentos
        setOferta(double d, String [] aeo);
    }

    public double setOferta(double d, String [] aeo) {
        descuento = d;
        autoresEnOferta = aeo;
    }

    public double getDescuento() {
        return descuento;
    }

    public String[] getOferta() {
        return autoresEnOferta;
    }
    public void addLibro(String autor, String titulo, double precioBase){
        boolean aeo = esAutorEnOferta(autor);
        Libro libro = null;
        if (aeo){
            libro = new LibroEnOferta(autor, titulo, precioBase, descuento);
        }
        else{
            libro = new Libro(autor, titulo, precioBase);
        }
        addLibro(libro);
    }
}
