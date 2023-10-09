package org.uma.mbd.mdNPI;

public class mainCalculadora {
    public static void main(String[] args) {
        //  3 * (6 - 2) + (2 + 7) / 5
        // NPI : 3 6 2 - * 2 7 + 5 / +
        NPI cpi = new NPI();
        cpi.entra(3);
        cpi.entra(6);
        cpi.entra(2);
        cpi.resta();
        cpi.multiplica();
        cpi.entra(2);
        cpi.entra(7);
        cpi.suma();
        cpi.entra(5);
        cpi.divide();
        cpi.suma();
        System.out.println("Resultado " + cpi.getResultado());

    }
}
