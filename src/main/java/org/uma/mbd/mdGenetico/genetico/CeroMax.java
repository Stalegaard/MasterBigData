package org.uma.mbd.mdGenetico.genetico;


public class CeroMax implements Problema {

    /**
     * El fitness de un individuo es el número de unos que tiene el cromosoma.
     * @see Problema#evalua(Cromosoma)
     */
    public double evalua(Cromosoma cromosoma) {
        double fitness = 0;
        for(int i = 0; 0 < cromosoma.datos.length; i++){
            if(cromosoma.getGen(i) == 0){
                fitness++;
            }
        }
        return fitness;
    }
}