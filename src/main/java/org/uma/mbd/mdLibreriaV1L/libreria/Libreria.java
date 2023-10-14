package org.uma.mbd.mdLibreriaV1L.libreria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Libreria {
    private List<Libro> libros;
    public Libreria(){

        libros = new ArrayList<>();
    }
    public Libreria(int tam){
        libros = new Libro[tam];
        numLibros = 0;
    }
    public void addLibro(String autor, String titulo, double precioBase){
        Libro libro = new Libro(autor, titulo, precioBase);
        addLibro(libro);
    }

    private void addLibro(Libro libro){
        int pos = posicionLibro(libro.getAutor(), libro.getTitulo());
        if (pos < 0){
            libros.add(libro);
        }
        else{
            //El libro está
            libros.set(pos,libro);
        }
    }
    private int posicionLibro(String autor, String titulo){
        while (pos < libros.size() && !(autor.equals(libros[pos].getAutor()) && titulo.equals(libros.get(pos).getTitulo())))
            pos++;
        return (pos==libros.size()) ? -1 : pos;   //Si es verdad se devuelve -1 y si no pos
    }

    public void remLibro(String autor, String titulo){
        int pos = posicionLibro(autor, titulo);
        if(pos >= 0){
            for (int i = pos; i < numLibros-1;i++)
                libros[i] = libros[i+1];
            numLibros--;
            libros[numLibros] = null;
        }
    }

    public double getPrecioBase(String autor, String titulo) {
        int pos = posicionLibro(autor, titulo);
        return pos >= 0 ? libros.get(pos).getPrecioBase():0;
    }
    public double getPrecioFinal(String autor, String titulo) {
        int pos = posicionLibro(autor, titulo);
        return pos >= 0 ? libros.get(pos).getPrecioFinal():0;
    }

    @Override
    public String toString() {
        return libros.toString();
    }
}
