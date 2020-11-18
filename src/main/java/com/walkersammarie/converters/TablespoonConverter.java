package com.walkersammarie.converters;

import org.apache.commons.math3.fraction.Fraction;

public class TablespoonConverter {

    InputConverter inputConverter = new InputConverter();

    public String tablespoonToTeaspoon(Fraction input) {
        String result;
        double tablespoon = input.doubleValue();
        double teaspoon = tablespoon * 3;
        if (teaspoon != (int)teaspoon) {
            Fraction f = new Fraction(teaspoon, 8);
            result = input + " tablespoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " teaspoon(s).";
        } else {
            result = input + " tablespoon(s) is equal to " + (int)teaspoon + " teaspoon(s).";
        }
        return result;
    }

    public String tablespoonToCup(Fraction input) {
        String result;
        double tablespoon = input.doubleValue();
        double cup = tablespoon / 16;
        if (cup != (int)cup) {
            Fraction f = new Fraction(cup, 8);
            result = input + " tablespoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " cup(s).";
        } else {
            result = input + " tablespoon(s) is equal to " + (int)cup + " cup(s).";
        }
        return result;
    }

    public String tablespoonToPint(Fraction input) {
        String result;
        double tablespoon = input.doubleValue();
        double pint = tablespoon / 32;
        if (pint != (int)pint) {
            Fraction f = new Fraction(pint, 8);
            result = input + " tablespoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " pint(s).";
        } else {
            result = input + " tablespoon(s) is equal to " + (int)pint + " pint(s).";
        }
        return result;
    }

    public String tablespoonToQuart(Fraction input) {
        String result;
        double tablespoon = input.doubleValue();
        double quart = tablespoon / 64;
        if (quart != (int)quart) {
            Fraction f = new Fraction(quart, 8);
            result = input + " tablespoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " quart(s).";
        } else {
            result = input + " tablespoon(s) is equal to " + (int)quart + " quart(s).";
        }
        return result;
    }

    public String tablespoonToGallon(Fraction input) {
        String result;
        double tablespoon = input.doubleValue();
        double gallon = tablespoon / 256;
        if (gallon != (int)gallon) {
            Fraction f = new Fraction(gallon, 8);
            result = input + " tablespoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " gallon(s).";
        } else {
            result = input + " tablespoon(s) is equal to " + (int)gallon + " gallon(s).";
        }
        return result;
    }

    public String tablespoonToFluidOunce(Fraction input) {
        String result;
        double tablespoon = input.doubleValue();
        double fluidOunce = tablespoon / 2;
        if (fluidOunce != (int)fluidOunce) {
            Fraction f = new Fraction(fluidOunce, 8);
            result = input + " tablespoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " fluid ounce(s).";
        } else {
            result = input + " tablespoon(s) is equal to " + (int)fluidOunce + " fluid ounce(s).";
        }
        return result;
    }

    public String tablespoonToML(Fraction input) {
        String result;
        double tablespoon = input.doubleValue();
        double mL = tablespoon * 14.7868;
        if (mL != (int)mL) {
            Fraction f = new Fraction(mL, 8);
            result = input + " tablespoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " mL(s).";
        } else {
            result = input + " tablespoon(s) is equal to " + (int)mL + " mL(s).";
        }
        return result;
    }

    public String tablespoonToLiter(Fraction input) {
        String result;
        double tablespoon = input.doubleValue();
        double liter = tablespoon / 67.628;
        if (liter != (int)liter) {
            Fraction f = new Fraction(liter, 8);
            result = input + " tablespoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " liter(s).";
        } else {
            result = input + " tablespoon(s) is equal to " + (int)liter + " liter(s).";
        }
        return result;
    }

}
