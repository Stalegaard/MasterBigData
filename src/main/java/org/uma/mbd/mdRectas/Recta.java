package org.uma.mbd.mdRectas;

import java.util.ArrayList;
import java.util.List;

public class Recta {
    public record Implicita(double a, double b, double c) { }
    private Vector direccion;
    private Punto pto;

    public Recta (Vector v_director , Punto q){ //Primer constructor - Vector director y Punto
        direccion = v_director;
        pto = q;
    }

    public Recta (Punto q, Punto t){ //Segundo constructor - Dos puntos
        direccion = new Vector(q,t);
        pto = q;
    }

    private double determinante(double a11, double a12, double a21, double a22){

        return a11 * a22 - a12 * a21;
    }
    public double distanciaDesde(Punto p){
        Recta r = perpendicularPor(p);
        Punto inter = interseccionCon(r);
        return inter.distancia(p);
    }
    private Implicita implicita(){
        double a = direccion.getComponenteY();
        double b = direccion.getComponenteX();
        double c = b * pto.getY() - a * pto.getX();
        return new Implicita(a,b,c);
    }

    public Punto interseccionCon(Recta s){
        Implicita r_imp = implicita();
        Implicita s_imp = s.implicita();
        double x = determinante(-r_imp.c(), r_imp.b(), -s_imp.b(), s_imp.b())/determinante(r_imp.a(), r_imp.b(), s_imp.a(), s_imp.b());
        double y = determinante(r_imp.a(), -r_imp.c(), s_imp.a(), -s_imp.c())/determinante(r_imp.a(), r_imp.b(), s_imp.a(), s_imp.b());
        return new Punto(x, y);
    }
    public boolean paralelaA(Recta s){ //Son paralelas si sus vectores de direccion son paralelos

        return direccion.paraleloA(s.direccion);
    }
    public Recta paralelelaPor(Punto p){
        return new Recta(direccion, p);
    }
    public boolean pasaPor(Punto p){ //Pasa por un punto si el vector formado por p y un punto de la recta es paralelo al vector director de la recta
        Vector v = new Vector(pto, p);
        return v.paraleloA(direccion);
    }
    public Recta perpendicularPor(Punto p){
        return new Recta(direccion.Ortogonal(), p);
    }
    @Override
    public String toString(){
        return "R( " + direccion + ", " + pto + ")";
    }
}
