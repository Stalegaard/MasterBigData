package org.uma.mbd.mdNPI;

public class mainPrueba {
    public static void main(String [] args) {
        // 5 + (6 - 2) * 3;
        // NPI 5 6 2 - 3 * +
        NPI cpi = new NPI();
        cpi.entra(5);
        cpi.entra(6);
        cpi.entra(2);
        System.out.println(" " + cpi);
        cpi.resta();
        System.out.println(" " + cpi);
        cpi.entra(3);
        System.out.println(" " + cpi);
        cpi.multiplica();
        cpi.suma();
        System.out.println("Resultado " + cpi.getResultado());
    }

}
