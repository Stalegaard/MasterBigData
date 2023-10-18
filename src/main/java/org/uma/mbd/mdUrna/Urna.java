package org.uma.mbd.mdUrna;

import java.util.NoSuchElementException;
import java.util.Random;

public class Urna {

    static public enum ColorBola {Blanca, Negra};

    private static Random alea = new Random();
    private int blancas, negras;

    public Urna(int nB, int nN){
        if(nB < 0 || nN < 0){
            throw new IllegalArgumentException("No se puede crear una urna con bolas negativas");
        }
        blancas = nB;
        negras = nN;
    }

    public int totalBolas(){
        return blancas + negras;
    }
    public ColorBola extraerBola(){
        int n = totalBolas();
        if (n == 0){
            throw new NoSuchElementException("El número de bolas es 0");
        }
        int numeroAleatorio = alea.nextInt(n);
        ColorBola Color;
        if(numeroAleatorio < blancas){
            Color = ColorBola.Blanca;
            blancas--;
        }
        else{
            Color = ColorBola.Negra;
            negras--;
        }
        return Color;
    }
    public void ponerBlanca(){
        blancas +=1;
    }
    public void ponerNegra(){
        negras +=1;
    }
    @Override
    public String toString(){
        return "U( Blancas: " + blancas + ", Negras: "+ negras +")";
    }

}
