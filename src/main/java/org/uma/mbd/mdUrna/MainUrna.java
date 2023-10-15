package org.uma.mbd.SegundaRelacion.mdUrna;
import org.uma.mbd.SegundaRelacion.mdUrna.Urna.ColorBola;

public class MainUrna {
    public static void main(String[] args) {
        int nBlancas = Integer.parseInt(args[0]);
        int nNegras = Integer.parseInt(args[1]);

        Urna Urna = new Urna(nBlancas,nNegras);

        int nBolas = Urna.totalBolas();

        while (nBolas >0) {
            ColorBola b1 = Urna.extraerBola();
            ColorBola b2 = Urna.extraerBola();
            if(b1 == b2){
                Urna.ponerBlanca();
            }
            else{
                Urna.ponerNegra();
            }
            if(nBolas==1){
                ColorBola ult_bola = Urna.extraerBola();
                System.out.printf("La ultima bola es de color: " + ult_bola);
            }
            nBolas--;
        }
    }
}
