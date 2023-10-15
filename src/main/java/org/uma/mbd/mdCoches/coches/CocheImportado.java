package org.uma.mbd.mdCoche;

class CocheImportado extends Coche {
    private double homologacion;
    public CocheImportado(String n, double p, double hom) {
        super(n, p);
        homologacion = hom;
    }

    public double precioTotal() {
        return super.precioTotal() + homologacion;
    }
}
