package org.uma.mbd.mdIndicePalabrasv1.indices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public abstract class Indice {
    List<String> texto;

    public Indice() {
        texto = new ArrayList<>();
    }

    public void agregarLinea(String textoNuevo){
        Scanner sc = new Scanner(textoNuevo);
        sc.useDelimiter("\n");
        while(sc.hasNextLine()) {
            texto.add(sc.nextLine());
        }
    }

    public abstract void resolver(String delimitadores, Collection<String> noSignificativas);

    public abstract void presentarIndiceConsola();
}
