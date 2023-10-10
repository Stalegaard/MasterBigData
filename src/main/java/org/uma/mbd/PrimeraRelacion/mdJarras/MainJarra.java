package org.uma.mbd.PrimeraRelacion.mdJarras;
import org.uma.mbd.PrimeraRelacion.mdJarras.jarras.*;

public class MainJarra {
    public static void main(String[] args) {
        int c1 = Integer.parseInt(args[0]);
        int c2 = Integer.parseInt(args[1]);
        Jarra j1 = new Jarra(c1);
        Jarra j2 = new Jarra(c2);

        j2.llena();
        j1.llenaDesde(j2);
        j2.llena();
        j1.llenaDesde(j2);
        j1.vacia();
        j1.llenaDesde(j2);
        j2.llena();
        j1.llenaDesde(j2);

        System.out.println("j1 " + j1);
        System.out.printf("j2 " + j2);
    }

}

//


