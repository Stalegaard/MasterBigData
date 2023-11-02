package org.uma.mbd.mdAmigoInvisible.amigos;

import java.util.Objects;

public record Pareja(Persona uno, Persona otro) {
    @Override
    public boolean equals (Object o){
        return (o instanceof Pareja p)
                && (p.uno.equals(uno) && p.otro.equals(otro) || (p.uno.equals(otro) && p.otro.equals(uno)));
    }
    @Override
    public int hashCode() {
        return Objects.hash(uno, otro);
    }
}
