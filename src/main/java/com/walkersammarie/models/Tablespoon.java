package com.walkersammarie.models;

import org.apache.commons.math3.fraction.Fraction;

public class Tablespoon extends Measurement {

    private String name = "tablespoon";
    private Fraction value;

    public Tablespoon() {}

    public Tablespoon(Fraction value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Fraction getValue() {
        return value;
    }

    public void setValue(Fraction value) {
        this.value = value;
    }

}
