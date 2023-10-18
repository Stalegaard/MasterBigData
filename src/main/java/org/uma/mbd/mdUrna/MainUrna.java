package org.uma.mbd.mdUrna;
import org.uma.mbd.mdUrna.Urna.ColorBola;

public class MainUrna {
    public static void main(String[] args) {
        int nBlancas = Integer.parseInt(args[0]);
        int nNegras = Integer.parseInt(args[1]);

        Urna urna = new Urna(nBlancas,nNegras);

        while (urna.totalBolas() >0) {
            ColorBola b1 = urna.extraerBola();
            ColorBola b2 = urna.extraerBola();
            if(b1 == b2){
                urna.ponerBlanca();
                System.out.println("ENTRA BLANCA");
            }
            else{
                urna.ponerNegra();
                System.out.println("ENTRA NEGRA");
            }
            System.out.println("Bola1: " + b1);
            System.out.println("Bola2: " + b2);
            System.out.println(" ");
            if(urna.totalBolas()==1){
                ColorBola ult_bola = urna.extraerBola();
                System.out.println("La ultima bola es de color: " + ult_bola);
            }


            System.out.println("Numero de bolas: " + urna.totalBolas());
        }
    }
}
