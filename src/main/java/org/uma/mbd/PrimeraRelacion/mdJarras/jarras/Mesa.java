package org.uma.mbd.PrimeraRelacion.mdJarras.jarras;

public class Mesa {
    private Jarra JarraA;
    private Jarra JarraB;

    public Mesa(int capInicial1, int capInicial2){
        JarraA = new Jarra(capInicial1);
        JarraB = new Jarra(capInicial2);
    }
    public void llenaA(){
        JarraA.llena();
    }
    public void llenaB(){
        JarraB.llena();
    }
    public void vaciaA(){
        JarraA.vacia();
    }
    public void vaciaB(){
        JarraB.vacia();
    }
    public void vuelcaAsobreB(){ JarraB.llenaDesde(JarraA);}
    public void vuelcaBsobreA(){ JarraA.llenaDesde(JarraB);}

    public int getContenidoA() { return JarraA.getContenido(); }
    public int getCapacidadA() { return JarraA.getCapacidad(); }
    public int getContenidoB() { return JarraB.getContenido(); }
    public int getCapacidadB() { return JarraB.getCapacidad(); }

    @Override
    public String toString(){
        return "Mesa[" + JarraA + ", "+ JarraB+"]";
    }

}
