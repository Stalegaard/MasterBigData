package org.uma.mbd.mdDegree.degree;

public record Celsius(double degree) implements Degree {
    public boolean isFrozen(){
        return degree < 0;
    }
    public Degree toCelsius(){
        return this;
    }
    public Degree toFahrenheit(){
        return new Fahrenheit(degree * 1.8 +32);
    }
}
