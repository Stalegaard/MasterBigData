package org.uma.mbd.mdBusV2.buses;
import java.util.Objects;
public class Bus implements Comparable<Bus>{
    private int codBus;
    private String matricula;
    private int codLinea;

    public Bus(int cod, String mat) {
        codBus = cod;
        matricula = mat;
    }

    public void setCodLinea(int codLinea) {
        this.codLinea = codLinea;
    }

    public int getCodBus() {
        return codBus;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCodLinea() {
        return codLinea;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Bus b)
                && (codBus == b.codBus)
                && (b.matricula.equalsIgnoreCase(matricula));
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula.toLowerCase(), codBus);
    }

    @Override

    public String toString() {
        return "Bus( " + codBus + ", " + matricula + ", " + codLinea + " )";
    }

    @Override
    public int compareTo(Bus b) {
        int resultado = matricula.compareTo(b.matricula);
        if (resultado == 0){
            resultado = Integer.compare(codBus,b.codBus);
        }
        return resultado;
    }
}