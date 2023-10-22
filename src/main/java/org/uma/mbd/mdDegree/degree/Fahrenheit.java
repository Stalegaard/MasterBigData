package org.uma.mbd.mdDegree.degree;

public record Fahrenheit(double degree) implements Degree {
    public boolean isFrozen(){
        return degree < 32;
    }
    public Degree toFahrenheit(){
        return this;
    }
    public Degree toCelsius(){
        return new Celsius((degree-32) / 1.8);
    }
}
