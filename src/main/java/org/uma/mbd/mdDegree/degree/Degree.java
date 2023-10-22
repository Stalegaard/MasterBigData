package org.uma.mbd.mdDegree.degree;

public sealed interface Degree permits Celsius, Fahrenheit{
    boolean isFrozen();
    Degree toCelsius();
    Degree toFahrenheit();
}
