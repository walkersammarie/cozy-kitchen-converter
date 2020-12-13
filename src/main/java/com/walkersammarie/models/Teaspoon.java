package com.walkersammarie.models;

import org.apache.commons.math3.fraction.Fraction;

public class Teaspoon extends Measurement {

    private String name = "teaspoon";
    private Fraction value;

    public Teaspoon() {}

    public Teaspoon(Fraction value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Fraction getFractionValue() {
        return value;
    }

    public void setFractionValue(Fraction fractionValue) {
        this.value = fractionValue;
    }

}
