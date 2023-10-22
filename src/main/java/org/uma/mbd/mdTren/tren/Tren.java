package org.uma.mbd.mdTren.tren;
import java.util.ArrayList;
import java.util.List;
public class Tren {
    private List<Vagon> vagones;
    public Tren(int numVagones, int capacidad){
        vagones = new ArrayList<>();
        for(int i = 0; i < numVagones; i++){
            vagones.add(new Vagon(capacidad));
        }
    }

    public void carga (int ton){
        int i = 0;
        while(ton > 0){
            Vagon vagonActual  = vagones.get(i);
            ton = vagonActual.carga(ton);
            if(ton > 0) {//Sobra
                i++;
                if(vagones.size() == i){ //Incrementamos el numero de vagones
                    vagones.add(new Vagon(vagonActual.getCapacidad()));
                }
            }
        }
    }

    public void gasta (int ton){
        int i = 0;
        while(ton > 0){
            Vagon vagonActual = vagones.get(i);
            ton = vagonActual.descarga(ton);
            if(ton > 0) {//Sobra
                i++;

                if(vagones.size() == i){ //Incrementamos el numero de vagones
                    throw new IllegalArgumentException("La cantidad a descargar es mayor que la carga total del tren");
                }
            }
        }

    }

    public void optimiza() {
        for (int i=0; i < vagones.size(); i++) {
            if(vagones.get(i).getCarga() == 0) {
                vagones.remove(i);
            }
        }
    }
    @Override
    public String toString() {
        String salida = "Tren[";
        for (int i=0; i<vagones.size(); i++) {
            salida += vagones.get(i);
            if (i < vagones.size()-1) {
                salida += ", ";
            }
        }
        salida += "]";
        return salida;
    }

}
