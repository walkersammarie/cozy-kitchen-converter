package com.walkersammarie.models;

import org.apache.commons.math3.fraction.Fraction;

public class Tablespoon extends Measurement {

    private static final String NAME = "tablespoon(s)";
    private Fraction value;

    public Tablespoon() {}

    public Tablespoon(Fraction value) {
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
