package com.walkersammarie.models;

import org.apache.commons.math3.fraction.Fraction;

public class Measurement {

    private String name = "measurement";
    private Fraction fractionValue;
    private Integer intValue;
    private Double doubleValue;

    public Measurement() {}

    public Measurement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Fraction getFractionValue() {
        return fractionValue;
    }

    public void setFractionValue(Fraction fractionValue) {
        this.fractionValue = fractionValue;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

}
