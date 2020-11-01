package com.walkersammarie.converters;

import org.apache.commons.math3.fraction.Fraction;

public class TeaspoonConverter {

    public String teaspoonToTablespoon(Fraction input) {
        String result;
        double teaspoon = input.doubleValue();
        double tablespoon = teaspoon / 3;
        if (tablespoon != (int)tablespoon) {
            Fraction f = new Fraction(tablespoon, 10);
            result = input + " teaspoon(s) is equal to " + f.toString() + " tablespoon(s).";
        } else {
            result = input + " teaspoon(s) is equal to " + (int)tablespoon + " tablespoon(s).";
        }
        return result;
    }

    public String teaspoonToTablespoon(int input) {
        String result;
        double tablespoon = input / 3.0;
        if (tablespoon != (int)tablespoon) {
            Fraction f = new Fraction(tablespoon, 10);
            result = input + " teaspoon(s) is equal to " + f.toString() + " tablespoon(s).";
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
            Fraction f = new Fraction(cup, 10);
            result = input + " teaspoon(s) is equal to " + f.toString() + " cup(s).";
        } else {
            result = input + " teaspoon(s) is equal to " + (int)cup + " cup(s).";
        }
        return result;
    }

    public String teaspoonToCup(int input) {
        String result;
        double cup = input / 48.0;
        if (cup != (int)cup) {
            Fraction f = new Fraction(cup, 10);
            result = input + " teaspoon(s) is equal to " + f.toString() + " cup(s).";
        } else {
            result = input + " teaspoon(s) is equal to " + (int)cup + " cup(s).";
        }
        return result;
    }


    public static void main(String[] args) {
        TeaspoonConverter v = new TeaspoonConverter();
        Fraction f = new Fraction(8, 3);
        String s = v.teaspoonToTablespoon(f);
        System.out.println(s);

        String st = v.teaspoonToTablespoon(3);
        System.out.println(st);

        Fraction fr = new Fraction(48, 1);
        String str = v.teaspoonToCup(fr);
        System.out.println(str);

        String stri = v.teaspoonToCup(72);
        System.out.println(stri);
    }

}

// doesn't work, trying to make a method that accepts a fraction or an int
//    public String teaspoonToTablespoon(Number input) {
//        String result;
//        double teaspoon;
//        if (input != (int)input) {
//            teaspoon = input.doubleValue();
//        } else {
//            teaspoon = (double)input;
//        }
//        double tablespoon = teaspoon / 3;
//        if (tablespoon != (int)tablespoon) {
//            Fraction f = new Fraction(tablespoon, 10);
//            result = input + " teaspoon(s) is equal to " + f.toString() + " tablespoon(s).";
//        } else {
//            result = input + " teaspoon(s) is equal to " + (int)tablespoon + " tablespoon(s).";
//        }
//        return result;
//    }