package org.uma.mbd.mdLibreriaV1L.libreria;
import org.uma.mbd.mdLibreriaV1L.libreria.libreria.Libro;

import java.util.Arrays;
public class Libreria {
    private Libro[] libros;
    private int numLibros;
    private static final int TAM_DEFECTO = 16;
    public Libreria(){
        this(TAM_DEFECTO);
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
            aseguraqueCabe();
            libros[numLibros] = libro;
            numLibros++;
            //El libro no está
        }
        else{
            //El libro está
            libros[pos] = libro;
        }
    }
    private int posicionLibro(String autor, String titulo){
        int pos = 0;
        while (pos < numLibros && !(autor.equals(libros[pos].getAutor()) && titulo.equals(libros[pos].getTitulo())))
            pos++;
        return (pos==numLibros) ? -1 : pos;   //Si es verdad se devuelve -1 y si no pos
    }

    private void aseguraqueCabe(){
        if (numLibros == libros.length) {
            libros = Arrays.copyOf(libros, libros.length*2);

        }
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
        return pos >= 0 ? libros[pos].getPrecioBase():0;
    }
    public double getPrecioFinal(String autor, String titulo) {
        int pos = posicionLibro(autor, titulo);
        return pos >= 0 ? libros[pos].getPrecioFinal():0;
    }

    @Override
    public String toString() {
        String salida = "[";
        for (int i= 0; i < numLibros; i++){
            salida += libros[i];
            if (i < numLibros-1)
                salida += ",";
        }

        salida += "]";
        return salida;

    }
}
