package com.walkersammarie.converters;

import org.apache.commons.math3.fraction.Fraction;

public class InputConverter {

    public Fraction intToFraction(int i) {
        Fraction f = new Fraction(i);
        return f;
    }

    public String doubleToFractionString(Fraction f) {
        String result;
        if (f.getNumerator() > f.getDenominator()) {
            int wholeNumber = (int)(f.getNumerator() / f.getDenominator());
            int numerator = f.getNumerator() % f.getDenominator();
            result = wholeNumber + " " + numerator + " / " + f.getDenominator();
        } else {
            result = f.toString();
        }
        return result;
    }

}