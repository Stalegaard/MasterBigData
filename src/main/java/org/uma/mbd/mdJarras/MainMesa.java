package org.uma.mbd.mdJarras;
import org.uma.mbd.mdJarras.jarras.*;

public class mainMesa {
    public static void main(String[] args) {
        Mesa M = new Mesa(7, 5);

        M.llenaB();
        M.vuelcaBsobreA();
        M.llenaB();
        M.vuelcaBsobreA();
        M.vaciaA();
        M.vuelcaBsobreA();
        M.llenaB();
        M.vuelcaBsobreA();

        System.out.println(M);
    }



}
