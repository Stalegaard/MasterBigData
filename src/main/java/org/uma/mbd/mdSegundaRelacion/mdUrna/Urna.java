package org.uma.mbd.mdUrna;

import java.util.NoSuchElementException;
import java.util.Random;

public class Urna {

    static public enum ColorBola {Blanca, Negra};

    private static Random alea = new Random();
    private int nBlancas, nNegras;

    public Urna(int nB, int nN){
        if(nB < 0 || nN < 0){
            throw new IllegalArgumentException("No se puede crear una urna con bolas negativas");
        }
        nBlancas = nB;
        nNegras = nN;
    }

    public int totalBolas(){
        return nBlancas + nNegras;
    }
    public ColorBola extraerBola(){
        int n = totalBolas();
        if (n == 0){
            throw new NoSuchElementException("El número de bolas es 0");
        }
        int numeroAleatorio = alea.nextInt(n);
        ColorBola Color;
        if(numeroAleatorio <= nBlancas){
            Color = ColorBola.Blanca;
        }
        else{
            Color = ColorBola.Negra;
        }
        return Color;
    }
    public void ponerBlanca(){
        nBlancas +=1;
    }
    public void ponerNegra(){
        nNegras +=1;
    }
    @Override
    public String toString(){
        return "U( Blancas: " + nBlancas + ", Negras: "+nNegras+")";
    }

}
