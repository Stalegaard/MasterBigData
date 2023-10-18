package org.uma.mbd.mdLibreriaV3L.libreria;

public class OfertaAutor implements OfertaFlex{
    private double descuento;
    private String [] autoresEnOferta;

    public OfertaAutor(double d, String [] aeo){
        descuento = d;
        autoresEnOferta = aeo;
    }

    @Override
    public double getDescuento(Libro libro) {
        boolean aeo = autoresEnOferta(autor);
        double des = 0;
        if (autorEnOferta(libro.getAutor()){
            des = descuento;
        }
        return des;
    }

    private boolean autorEnOferta(String autor){
        int pos = 0;
        while (pos < autoresEnOferta.length)
    }
}
