package com.walkersammarie.converters;

import com.walkersammarie.models.Measurement;
import org.apache.commons.math3.fraction.Fraction;

public class IOConverter {

    public Fraction stringToFraction(String input) {
        Fraction result;
        try {
            String[] values = input.split(" ");
            int wholeNumber = Integer.parseInt(values[0]);
            int num = 0;
            int denom = 0;
            if (values.length > 1) {
                String[] numAndDenom = values[1].split("/");
                num = Integer.parseInt(numAndDenom[0]);
                denom = Integer.parseInt(numAndDenom[1]);
            }
            if (num != 0 && denom != 0) {
                result = new Fraction((wholeNumber * denom + num), denom);
            } else {
                result = new Fraction(wholeNumber);
            }
            return result;
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            return null;
        }
    }

    private String fractionToString(Fraction f) {
        String result;
        if (f.getNumerator() > f.getDenominator()) {
            int wholeNumber = (int)(f.getNumerator() / f.getDenominator());
            int numerator = f.getNumerator() % f.getDenominator();
            if (numerator == 0) {
                result = wholeNumber + "";
            } else {
                result = wholeNumber + " " + numerator + "/" + f.getDenominator();
            }

        } else {
            result = f.getNumerator() + "/" + f.getDenominator();
        }
        return result;
    }

    public String generateResultSentence(Measurement original, Measurement conversion) {
        String result = fractionToString(original.getValue()) + " " + original.getName() + "(s) is equal to " +
                fractionToString(conversion.getValue()) + " " + conversion.getName() + "(s).";
        return result;
    }

}