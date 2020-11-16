package com.walkersammarie.converters;

import org.apache.commons.math3.fraction.Fraction;

public class TablespoonConverter {

    public String tablespoonToTeaspoon(Fraction input) {
        String result;
        double tablespoon = input.doubleValue();
        double teaspoon = tablespoon * 3;
        if (teaspoon != (int)teaspoon) {
            Fraction f = new Fraction(teaspoon, 8);
            result = input + " tablespoon(s) is equal to " + f.toString() + " teaspoon(s).";
        } else {
            result = input + " tablespoon(s) is equal to " + teaspoon + " teaspoon(s).";
        }
        return result;
    }

    public String tablespoonToCup(Fraction input) {
        String result;
        double tablespoon = input.doubleValue();
        double cup = tablespoon / 16;
        if (cup != (int)cup) {
            Fraction f = new Fraction(cup, 8);
            result = input + " tablespoon(s) is equal to " + f.toString() + " cup(s).";
        } else {
            result = input + " tablespoon(s) is equal to " + cup + " cup(s).";
        }
        return result;
    }

    public String tablespoonToPint(Fraction input) {
        String result;
        double tablespoon = input.doubleValue();
        double pint = tablespoon / 32;
        if (pint != (int)pint) {
            Fraction f = new Fraction(pint, 8);
            result = input + " tablespoon(s) is equal to " + f.toString() + " pint(s).";
        } else {
            result = input + " tablespoon(s) is equal to " + pint + " pint(s).";
        }
        return result;
    }

}
