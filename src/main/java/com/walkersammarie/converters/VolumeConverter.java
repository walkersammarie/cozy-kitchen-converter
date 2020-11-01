package com.walkersammarie.converters;

//import com.walkersammarie.Fraction;
import org.apache.commons.math3.fraction.Fraction;

import java.math.BigDecimal;

public class VolumeConverter {

    public Fraction teaspoonToTablespoon(Fraction input) {
        BigDecimal three = new BigDecimal(3);
        BigDecimal teaspoon = new BigDecimal(input.getNumerator() / input.getDenominator());
        BigDecimal tablespoon = new BigDecimal(String.valueOf(teaspoon.divide(three)));

        Fraction result = new Fraction(0, 1, 1);
        return result;
    }

    public static void main(String[] args) {
        Fraction f = new Fraction(4, 3);
        double i = f.multiply(3).doubleValue();
        System.out.println(i);
        if (i == (int)i) {
            System.out.println(true);
        }
    }

}
