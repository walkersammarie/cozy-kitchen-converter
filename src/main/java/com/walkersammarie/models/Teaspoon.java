package com.walkersammarie.models;

import org.apache.commons.math3.fraction.Fraction;

public class Teaspoon extends Measurement {

    private static final String NAME = "teaspoon(s)";
    private Fraction value;

    public Teaspoon() {}

    public Teaspoon(Fraction value) {
        this.value = value;
    }

    public static String getName() {
        return NAME;
    }

    public Fraction getValue() {
        return value;
    }

    public void setValue(Fraction value) {
        this.value = value;
    }

}
