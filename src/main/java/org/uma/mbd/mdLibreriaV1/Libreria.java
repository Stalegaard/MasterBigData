package org.uma.mbd.mdLibreriaV1;

public class Libreria {
    private Libro [] libros;
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
        addLibro(Libro);
    }

    private void addLibro(Libro libro){
        int pos = posicionLibro(libro.getAutor(), libro.getTitulo());
        if (pos < 0){
            //El libro no está
        }
        else{
            //El libro está
        }
    }
}
