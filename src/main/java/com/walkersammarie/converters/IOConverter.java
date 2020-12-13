package com.walkersammarie.converters;

import com.walkersammarie.models.Measurement;
import org.apache.commons.math3.fraction.Fraction;

public class IOConverter {

    public Fraction stringToFraction(String input) {
        Fraction result;
        int num;
        int denom;

        try {
            String[] firstSplit = input.split(" ");
            String[] secondSplit;
            if (firstSplit.length == 1) {
                secondSplit = firstSplit[0].split("/");
                if (secondSplit.length == 1) {
                    num = Integer.parseInt(secondSplit[0]);
                    denom = 1;
                    result = new Fraction(num, denom);
                } else if (secondSplit.length == 2) {
                    num = Integer.parseInt(secondSplit[0]);
                    denom = Integer.parseInt(secondSplit[1]);
                    result = new Fraction(num, denom);
                } else {
                    result = null;
                }
            } else if (firstSplit.length == 2) {
                secondSplit = firstSplit[0].split("/");
                if (secondSplit.length == 2) {
                    denom = Integer.parseInt(secondSplit[1]);
                    num = Integer.parseInt(secondSplit[0]) + Integer.parseInt(firstSplit[0]) * denom;
                    result = new Fraction(num, denom);
                } else {
                    result = null;
                }
            } else {
                result = null;
            }
            return result;
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            return null;
        }
    }

    private String fractionToString(Fraction f) {
        String result;
        if (f.getNumerator() > f.getDenominator()) {
            int wholeNumber = f.getNumerator() / f.getDenominator();
            int numerator = f.getNumerator() % f.getDenominator();
            if (numerator == 0) {
                result = wholeNumber + "";
            } else {
                result = wholeNumber + " " + numerator + "/" + f.getDenominator();
            }
        } else if (f.getNumerator() == f.getDenominator()) {
            result = f.getNumerator() + "";
        }
        else {
            result = f.getNumerator() + "/" + f.getDenominator();
        }
        return result;
    }

    public String generateResultSentence(Measurement original, Measurement conversion) {
        String result;
        if (original.getName().equals("celsius") || original.getName().equals("fahrenheit")) {
            result = original.getIntValue() + " degrees " + original.getName() + " is equal to " +
                    conversion.getIntValue() + " degrees " + conversion.getName() + ".";
        } else if (conversion.getIntValue() != null) {
            result = fractionToString(original.getFractionValue()) + " " + original.getName() + "(s) is equal to " +
                    conversion.getIntValue() + " " + conversion.getName() + "(s).";
        } else {
            result = fractionToString(original.getFractionValue()) + " " + original.getName() + "(s) is equal to " +
                    fractionToString(conversion.getFractionValue()) + " " + conversion.getName() + "(s).";
        }
        return result;
    }

}