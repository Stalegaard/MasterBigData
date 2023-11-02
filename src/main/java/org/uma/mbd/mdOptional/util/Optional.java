package org.uma.mbd.mdOptional.util;

import java.util.NoSuchElementException;

public sealed interface Optional<T> permits Empty, Just{
   static <T> Optional <T> of (T dato){
       return new Just(dato);
   }
    static <T> Optional <T> empty(){
        return new Empty<T>();
    }
    default T get(){
       throw new NoSuchElementException("No existe");
    }
    default boolean isPresent(){
       return false;
    }
}
record Empty<T>() implements Optional<T>{};
record Just<T>(T get) implements Optional<T>{
    @Override
    public boolean isPresent() {
        return true;
    }
};