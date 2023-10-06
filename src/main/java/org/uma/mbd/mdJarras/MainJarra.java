package org.uma.mbd.mdJarras;
import org.uma.mbd.mdJarras.jarras.*;
import org.w3c.dom.ls.LSOutput;

public class MainJarra {
    public static void main(String[] args) {
        Jarra j1 = new Jarra(7);

        System.out.println(j1);
        Jarra j2 = new Jarra(5);
        j1.llena();
        j2.llenaDesde(j1);
        j2.vacia();
        j2.llenaDesde(j1);
        j1.llena();
        j2.llenaDesde(j1);
        j2.vacia();
        j2.llenaDesde(j1);

        System.out.println("j1 " + j1);
        System.out.printf("j2 " + j2);
    }

}

//


