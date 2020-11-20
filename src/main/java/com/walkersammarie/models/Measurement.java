package com.walkersammarie.models;

import org.apache.commons.math3.fraction.Fraction;

public class Measurement {

    private String name = "measurement";
    private Fraction value;

    public Measurement() {}

    public Measurement(Fraction value) {
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
