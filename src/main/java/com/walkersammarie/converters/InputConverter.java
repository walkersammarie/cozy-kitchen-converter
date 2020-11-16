package com.walkersammarie.converters;

import org.apache.commons.math3.fraction.Fraction;

public class InputConverter {

    public Fraction intToFraction(int i) {
        Fraction f = new Fraction(i);
        return f;
    }

}
