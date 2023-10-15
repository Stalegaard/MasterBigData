package org.uma.mbd.PrimeraRelacion.mdTesoro;

import org.uma.mbd.PrimeraRelacion.mdRectas.Punto;
import org.uma.mbd.PrimeraRelacion.mdRectas.Recta;
import org.uma.mbd.PrimeraRelacion.mdRectas.Vector;

public class Tesoro {
    private Punto PalmeraAmarilla;
    private Punto PalmeraAzul;
    private Punto PalmeraRosa;
    private Punto EstacaAzul;
    private Punto EstacaAmarilla;

    private Punto Tesoro;

    public Tesoro(Punto PAma, Punto Pazu, Punto Pros){
        PalmeraAmarilla = PAma;
        PalmeraAzul = Pazu;
        PalmeraRosa = Pros;
        calculaPosiciones();
    }

    private void calculaPosiciones(){
        Vector v = new Vector(PalmeraRosa,PalmeraAmarilla);
        Vector Vperpe = v.ortogonal();
        EstacaAmarilla = Vperpe.extremoDesde(PalmeraAmarilla);

        Vector w = new Vector(PalmeraRosa, PalmeraAzul);
        Vector Wperpe = w.ortogonal().ortogonal().ortogonal();
        EstacaAzul = Wperpe.extremoDesde(PalmeraAzul);

        Tesoro = new Punto((EstacaAmarilla.getX() + EstacaAzul.getX())/2 , (EstacaAmarilla.getY() + EstacaAzul.getY())/2);

    }

    public Punto getEstacaAmarilla() {
        calculaPosiciones();
        return EstacaAmarilla;
    }

    public Punto getEstacaAzul() {
        calculaPosiciones();
        return EstacaAzul;
    }

    public Punto getTesoro() {
        calculaPosiciones();
        return Tesoro;
    }

    public void setPalmeraAmarilla(Punto palmeraAmarilla) {
        PalmeraAmarilla = palmeraAmarilla;
        calculaPosiciones();
    }

    public void setPalmeraAzul(Punto palmeraAzul) {
        PalmeraAzul = palmeraAzul;
        calculaPosiciones();
    }

    public void setPalmeraRosa(Punto palmeraRosa) {
        PalmeraRosa = palmeraRosa;
        calculaPosiciones();
    }
}
