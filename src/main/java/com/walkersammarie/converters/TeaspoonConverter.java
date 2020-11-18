package com.walkersammarie.converters;

import org.apache.commons.math3.fraction.Fraction;

public class TeaspoonConverter {

    InputConverter inputConverter = new InputConverter();

    public String teaspoonToTablespoon(Fraction input) {
        String result;
        double teaspoon = input.doubleValue();
        double tablespoon = teaspoon / 3;
        if (tablespoon != (int)tablespoon) {
            Fraction f = new Fraction(tablespoon, 8);
            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " tablespoon(s).";
        } else {
            result = input + " teaspoon(s) is equal to " + (int)tablespoon + " tablespoon(s).";
        }
        return result;
    }

    public String teaspoonToCup(Fraction input) {
        String result;
        double teaspoon = input.doubleValue();
        double cup = teaspoon / 48;
        if (cup != (int)cup) {
            Fraction f = new Fraction(cup, 8);
            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " cup(s).";
        } else {
            result = input + " teaspoon(s) is equal to " + (int)cup + " cup(s).";
        }
        return result;
    }

    public String teaspoonToPint(Fraction input) {
        String result;
        double teaspoon = input.doubleValue();
        double pint = teaspoon / 96;
        if (pint != (int)pint) {
            Fraction f = new Fraction(pint, 8);
            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " pint(s).";
        } else {
            result = input + " teaspoon(s) is equal to " + (int)pint + " pint(s).";
        }
        return result;
    }

    public String teaspoonToQuart(Fraction input) {
        String result;
        double teaspoon = input.doubleValue();
        double quart = teaspoon / 192;
        if (quart != (int)quart) {
            Fraction f = new Fraction(quart, 8);
            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " quart(s).";
        } else {
            result = input + " teaspoon(s) is equal to " + (int)quart + " quart(s).";
        }
        return result;
    }

    public String teaspoonToGallon(Fraction input) {
        String result;
        double teaspoon = input.doubleValue();
        double gallon = teaspoon / 768;
        if (gallon != (int)gallon) {
            Fraction f = new Fraction(gallon, 8);
            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " gallon(s).";
        } else {
            result = input + " teaspoon(s) is equal to " + (int)gallon + " gallon(s).";
        }
        return result;
    }

    public String teaspoonToFluidOunce(Fraction input) {
        String result;
        double teaspoon = input.doubleValue();
        double fluidOunce = teaspoon / 6;
        if (fluidOunce != (int)fluidOunce) {
            Fraction f = new Fraction(fluidOunce, 8);
            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " fluid ounce(s).";
        } else {
            result = input + " teaspoon(s) is equal to " + (int)fluidOunce + " fluid ounce(s).";
        }
        return result;
    }

    public String teaspoonToML(Fraction input) {
        String result;
        double teaspoon = input.doubleValue();
        double mL = teaspoon * 4.929;
        if (mL != (int)mL) {
            Fraction f = new Fraction(mL, 8);
            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " mL(s).";
        } else {
            result = input + " teaspoon(s) is equal to " + (int)mL + " mL(s).";
        }
        return result;
    }

    public String teaspoonToLiter(Fraction input) {
        String result;
        double teaspoon = input.doubleValue();
        double liter = teaspoon / 203;
        if (liter != (int)liter) {
            Fraction f = new Fraction(liter, 8);
            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " liter(s).";
        } else {
            result = input + " teaspoon(s) is equal to " + (int)liter + " liter(s).";
        }
        return result;
    }

    public static void main(String[] args) {
        TeaspoonConverter teaspoonConverter = new TeaspoonConverter();
        InputConverter inputConverter = new InputConverter();

        Fraction f = new Fraction(8, 3);
        String s = teaspoonConverter.teaspoonToTablespoon(f);
        System.out.println(s);
        System.out.println(inputConverter.doubleToFractionString(f));

        String st = teaspoonConverter.teaspoonToTablespoon(inputConverter.intToFraction(4));
        System.out.println(st);

        Fraction fr = new Fraction(48, 1);
        String str = teaspoonConverter.teaspoonToCup(fr);
        System.out.println(str);

        String stri = teaspoonConverter.teaspoonToCup(inputConverter.intToFraction(7));
        System.out.println(stri);
    }

}