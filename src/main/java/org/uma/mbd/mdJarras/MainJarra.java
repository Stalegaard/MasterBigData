package org.uma.mbd.mdJarras;
import org.uma.mbd.mdJarras.jarras.*;
import org.w3c.dom.ls.LSOutput;

public class MainJarra {
    public static void main(String[] args) {
        Jarra j1 = new Jarra(7);

        System.out.println(j1);
        Jarra j2 = new Jarra(5);
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


