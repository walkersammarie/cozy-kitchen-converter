package com.walkersammarie.converters;

import org.apache.commons.math3.fraction.Fraction;

public class CupConverter {

    IOConverter IOConverter = new IOConverter();

    public String cupToTeaspoon(Fraction input) {
        String result;
        double cup = input.doubleValue();
        double teaspoon = cup * 48;
        if (teaspoon != (int)teaspoon) {
            Fraction f = new Fraction(teaspoon, 8);
            result = input + " cup(s) is equal to " + IOConverter.doubleToFractionString(f) + " teaspoon(s).";
        } else {
            result = input + " cup(s) is equal to " + (int)teaspoon + " teaspoon(s).";
        }
        return result;
    }

    public String cupToTablespoon(Fraction input) {
        String result;
        double cup = input.doubleValue();
        double tablespoon = cup * 16;
        if (tablespoon != (int)tablespoon) {
            Fraction f = new Fraction(tablespoon, 8);
            result = input + " cup(s) is equal to " + IOConverter.doubleToFractionString(f) + " tablespoon(s).";
        } else {
            result = input + " cup(s) is equal to " + (int)tablespoon + " tablespoon(s).";
        }
        return result;
    }

}