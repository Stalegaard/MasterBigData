package org.uma.mbd.mdDegree;

import org.uma.mbd.mdDegree.degree.Celsius;
import org.uma.mbd.mdDegree.degree.Degree;
import org.uma.mbd.mdDegree.degree.Fahrenheit;

import java.util.List;

public class MainDegree {
    public static void main(String[] args) {
        List<Degree> ld = List.of(
                new Fahrenheit(37),
                new Celsius(37),
                new Fahrenheit(29),
                new Celsius(31)
        );
        ld.forEach(d -> System.out.println(d));
    }


}
