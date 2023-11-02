package org.uma.mbd.mdAmigoInvisible.amigos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ClubManager {
    private String fEntrada;
    private String delimitadores;
    private String fSalida;
    private boolean consola;
    private Club club;

    public ClubManager(Club club){
        this.club = club;
    }
    public ClubManager setEntrada (String fEntrada, String delim){
        this.fEntrada = fEntrada;
        delimitadores = delim;
        return this;
    }
    public ClubManager setSalida(String salida){
        fSalida = salida;
        return this;
    }
    public ClubManager setConsola(boolean consola){
        this.consola = consola;
        return this;
    }

    private void verify(){
        if (fEntrada == null) {
            throw new AmigoException("No hay archivo de entrada definido");
        }
        if(!consola && fSalida == null) {
            throw new AmigoException("No hay una salida definida");
        }
    }

    public void build() throws IOException {
        verify();
        club.lee(fEntrada, delimitadores);
        club.hacerAmigos();
        System.out.println(consola);
        if(consola){
            club.presentaAmigos(new PrintWriter(System.out, true));
        }
        if (fSalida != null) {
            try {
                club.presentaAmigos(fSalida);
            } catch (FileNotFoundException e) {
                System.err.println("No se encuentra el fichero "+ fSalida);
            }
        }
    }
}
