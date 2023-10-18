package org.uma.mbd.mdTesoro;

import org.uma.mbd.mdRectas.Punto;

public class MainTesoro {
    public static void main(String[] args) {
        Punto  PalmeraAmarilla = new Punto(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
        Punto  PalmeraAzul = new Punto(Double.parseDouble(args[2]),Double.parseDouble(args[3]));
        Punto  PalmeraRosa = new Punto(Double.parseDouble(args[4]),Double.parseDouble(args[5]));
        Tesoro Tesoro = new Tesoro(PalmeraAmarilla,PalmeraAzul,PalmeraRosa);

        System.out.println("Estaca Azul: "+Tesoro.getEstacaAzul());
        System.out.println("Estaca Amarilla: "+Tesoro.getEstacaAmarilla());
        System.out.println("Tesoro: "+Tesoro.getTesoro());
    }
}
