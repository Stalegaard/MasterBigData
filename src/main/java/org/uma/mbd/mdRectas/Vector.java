package org.uma.mbd.mdRectas;

public class Vector {
    private Punto extremo;

    public Vector (double a, double b){ //PRIMER CONSTRUCTOR -DOS COMPONENTES
        extremo = new Punto(a,b);
    }
    public Vector (Punto q){ // SEGUNDO CONSTRUCTOR - PUNTO EXTREMO
        this(q.getX(), q.getY());
    }
    public Vector( Punto p, Punto q){ //TERCER CONSTRUCTOR - DOS PUNTOS
        this(q.getX() - p.getX(),q.getY() - p.getY());
    }

    public double getComponenteX() { return extremo.getX(); }
    public double getComponenteY() { return extremo.getY(); }
    public Vector Ortogonal(){
        return new Vector(-getComponenteY(), getComponenteX());
    }
    public Punto extremoDesde (Punto org){
        double newX = org.getX() + getComponenteX();
        double newY = org.getY() + getComponenteY();
        return new Punto(newX , newY);
    }
    public double modulo(){
        return Math.sqrt(Math.pow(getComponenteX(),2)+ Math.pow(getComponenteY(),2));
    }
    public boolean paraleloA(Vector w){
        return getComponenteX() * w.getComponenteY() == getComponenteY() * w.getComponenteX();
    }
    @Override
    public String toString(){
        return "V(" + getComponenteX() + ", " + getComponenteY() + ")";
    }
}
