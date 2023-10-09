package org.uma.mbd.mdEstadistica;

public class Estadistica {

    private int numElementos;
    private double sumaX;
    private double sumaX2;

    public void agrega(double d){
        numElementos += 1;
        sumaX += d;
        sumaX2 += Math.pow(d,2);
    }

    public void agrega(double d, int n){
        numElementos += n;
        sumaX += n * d;
        sumaX2 += n * Math.pow(d,2);
    }

    public double media(){
        double media;
        return media = sumaX/numElementos;
    }

    public double varianza(){
        double varianza;
        return varianza = (sumaX2/numElementos) - Math.pow(media(),2);
    }

    public double desviacionTipica(){
        double desviacion;
        return desviacion = Math.sqrt(varianza());
    }

}
