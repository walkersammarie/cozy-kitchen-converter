package com.walkersammarie.converters;

import com.walkersammarie.models.Measurement;
import org.apache.commons.math3.fraction.Fraction;

public class IOConverter {

    public Fraction inputToFraction(int wholeNumber, int num, int denom) {
        if (wholeNumber != 0) {
            num += wholeNumber * denom;
        }
        Fraction f = new Fraction(num, denom);
        return f;
    }

    public String fractionToString(Fraction f) {
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

    public String generateResultSentence(Measurement original, Measurement conversion) {
        String result = fractionToString(original.getValue()) + " " + original.getName() + " is equal to " +
                fractionToString(conversion.getValue()) + " " + conversion.getName() + ".";
        return result;
    }

}