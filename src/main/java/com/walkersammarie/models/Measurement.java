package com.walkersammarie.models;

import org.apache.commons.math3.fraction.Fraction;

public class Measurement {

    private static final String NAME = "measurement";
    private Fraction value;

    public Measurement() {}

    public Measurement(Fraction value) {
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
