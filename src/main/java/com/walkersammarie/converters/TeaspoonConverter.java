package com.walkersammarie.converters;

import com.walkersammarie.models.Measurement;
import com.walkersammarie.models.Tablespoon;
import com.walkersammarie.models.Teaspoon;
import org.apache.commons.math3.fraction.Fraction;

public class TeaspoonConverter {

    private static final double TABLESPOON_CONVERSION = 3;
    private static final double CUP_CONVERSION = 48;
    private static final double PINT_CONVERSION = 96;
    private static final double QUART_CONVERSION = 192;
    private static final double GALLON_CONVERSION = 768;
    private static final double FLUID_OUNCE_CONVERSION = 6;
    private static final double ML_CONVERSION = 1 / 4.929;
    private static final double LITER_CONVERSION = 203;

    public Measurement convertFromTeaspoon(Teaspoon original, Measurement conversion) {
        double teaspoon = original.getValue().doubleValue();
        double result = teaspoon / getConverter(conversion);
        Fraction f = new Fraction(result);
        conversion.setValue(f);
        return conversion;
    }

    private double getConverter(Measurement conversion) {
        if (conversion.getName().equals("tablespoons(s)")) {
            return TABLESPOON_CONVERSION;
        } else if (conversion.getName().equals("cup(s)")) {
            return CUP_CONVERSION;
        } else if (conversion.getName().equals("pint(s)")) {
            return PINT_CONVERSION;
        } else if (conversion.getName().equals("quart(s)")) {
            return QUART_CONVERSION;
        } else if (conversion.getName().equals("gallon(s)")) {
            return GALLON_CONVERSION;
        } else if (conversion.getName().equals("fluid ounces(s)")) {
            return FLUID_OUNCE_CONVERSION;
        } else if (conversion.getName().equals("mL(s)")) {
            return ML_CONVERSION;
        } else if (conversion.getName().equals("liter(s)")) {
            return LITER_CONVERSION;
        } else {
            return 0;
        }
    }

//    InputConverter inputConverter = new InputConverter();
//
//    public String teaspoonToTablespoon(Fraction input) {
//        String result;
//        double teaspoon = input.doubleValue();
//        double tablespoon = teaspoon / 3;
//        if (tablespoon != (int)tablespoon) {
//            Fraction f = new Fraction(tablespoon, 8);
//            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " tablespoon(s).";
//        } else {
//            result = input + " teaspoon(s) is equal to " + (int)tablespoon + " tablespoon(s).";
//        }
//        return result;
//    }
//
//    public String teaspoonToCup(Fraction input) {
//        String result;
//        double teaspoon = input.doubleValue();
//        double cup = teaspoon / 48;
//        if (cup != (int)cup) {
//            Fraction f = new Fraction(cup, 8);
//            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " cup(s).";
//        } else {
//            result = input + " teaspoon(s) is equal to " + (int)cup + " cup(s).";
//        }
//        return result;
//    }
//
//    public String teaspoonToPint(Fraction input) {
//        String result;
//        double teaspoon = input.doubleValue();
//        double pint = teaspoon / 96;
//        if (pint != (int)pint) {
//            Fraction f = new Fraction(pint, 8);
//            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " pint(s).";
//        } else {
//            result = input + " teaspoon(s) is equal to " + (int)pint + " pint(s).";
//        }
//        return result;
//    }
//
//    public String teaspoonToQuart(Fraction input) {
//        String result;
//        double teaspoon = input.doubleValue();
//        double quart = teaspoon / 192;
//        if (quart != (int)quart) {
//            Fraction f = new Fraction(quart, 8);
//            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " quart(s).";
//        } else {
//            result = input + " teaspoon(s) is equal to " + (int)quart + " quart(s).";
//        }
//        return result;
//    }
//
//    public String teaspoonToGallon(Fraction input) {
//        String result;
//        double teaspoon = input.doubleValue();
//        double gallon = teaspoon / 768;
//        if (gallon != (int)gallon) {
//            Fraction f = new Fraction(gallon, 8);
//            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " gallon(s).";
//        } else {
//            result = input + " teaspoon(s) is equal to " + (int)gallon + " gallon(s).";
//        }
//        return result;
//    }
//
//    public String teaspoonToFluidOunce(Fraction input) {
//        String result;
//        double teaspoon = input.doubleValue();
//        double fluidOunce = teaspoon / 6;
//        if (fluidOunce != (int)fluidOunce) {
//            Fraction f = new Fraction(fluidOunce, 8);
//            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " fluid ounce(s).";
//        } else {
//            result = input + " teaspoon(s) is equal to " + (int)fluidOunce + " fluid ounce(s).";
//        }
//        return result;
//    }
//
//    public String teaspoonToML(Fraction input) {
//        String result;
//        double teaspoon = input.doubleValue();
//        double mL = teaspoon * 4.929;
//        if (mL != (int)mL) {
//            Fraction f = new Fraction(mL, 8);
//            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " mL(s).";
//        } else {
//            result = input + " teaspoon(s) is equal to " + (int)mL + " mL(s).";
//        }
//        return result;
//    }
//
//    public String teaspoonToLiter(Fraction input) {
//        String result;
//        double teaspoon = input.doubleValue();
//        double liter = teaspoon / 203;
//        if (liter != (int)liter) {
//            Fraction f = new Fraction(liter, 8);
//            result = input + " teaspoon(s) is equal to " + inputConverter.doubleToFractionString(f) + " liter(s).";
//        } else {
//            result = input + " teaspoon(s) is equal to " + (int)liter + " liter(s).";
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        TeaspoonConverter teaspoonConverter = new TeaspoonConverter();
//        InputConverter inputConverter = new InputConverter();
//
//        Fraction f = new Fraction(8, 3);
//        String s = teaspoonConverter.teaspoonToTablespoon(f);
//        System.out.println(s);
//        System.out.println(inputConverter.doubleToFractionString(f));
//
//        String st = teaspoonConverter.teaspoonToTablespoon(inputConverter.intToFraction(4));
//        System.out.println(st);
//
//        Fraction fr = new Fraction(48, 1);
//        String str = teaspoonConverter.teaspoonToCup(fr);
//        System.out.println(str);
//
//        String stri = teaspoonConverter.teaspoonToCup(inputConverter.intToFraction(7));
//        System.out.println(stri);
//    }

}