package org.uma.mbd.mdAlturas;

import org.uma.mbd.mdAlturas.alturas.EnContinente;
import org.uma.mbd.mdAlturas.alturas.MenoresQue;
import org.uma.mbd.mdAlturas.alturas.Pais;
import org.uma.mbd.mdAlturas.alturas.Mundo;

import java.io.IOException;
import java.util.*;

public class MainMundo {
    public static void main(String args[]) throws IOException {
        Mundo paises = new Mundo();
        paises.leePaises("recursos/mdAlturas/alturas.txt");

        List<Pais> listaPaises = new ArrayList<>(paises.selecciona(new MenoresQue(1.70)));

        //List<Pais> listaPaises2 = new ArrayList<>(paises.selecciona(new EnContinente("Europe")));

        Comparator<Pais> ordenAltura =  (p1, p2) ->  Double.compare(p1.altura(), p2.altura()); //a)
        Comparator<Pais> ordenAlfabetico =  (p1, p2) ->   p1.nombre().compareTo(p2.nombre()); //b)
        Comparator<Pais> ordenContinente =  (p1, p2) ->   p1.continente().compareTo(p2.continente()); //apoyo c)

        Comparator<Pais> ordenContAlf = ordenContinente.thenComparing(ordenAlfabetico); //c)
        Comparator<Pais> ordenContAlfInv = ordenContinente.thenComparing(ordenAlfabetico.reversed()); //d)
        Comparator<Pais> ordenContNat = ordenContinente.thenComparing(Comparator.naturalOrder()); //f)

        Set<Pais> setOrdenAltura = new TreeSet<>(ordenAltura); //a)
        Set<Pais> setOrdenAlfabetico = new TreeSet<>(ordenAlfabetico); //b)
        Set<Pais> setOrdenContAlf = new TreeSet<>(ordenContAlf); //c)
        Set<Pais> setOrdenContAlfInv = new TreeSet<>(ordenContAlfInv); //d)
        Set<Pais> setOrdenContNat = new TreeSet<>(ordenContNat);

        for (Pais pais:listaPaises) {
            setOrdenAltura.add(pais);
            setOrdenAlfabetico.add(pais);
            setOrdenContAlf.add(pais);
            setOrdenContAlfInv.add(pais);
            setOrdenContNat.add(pais);
        }

        //Se ha utilizado un metodo privado para realizar pruebas
        consolaPruebas(setOrdenContNat);


    }

    private static void consolaPruebas(Set<Pais> setPais) {
        for (Pais p : setPais) {
            System.out.println(p);
        }
    }
}

