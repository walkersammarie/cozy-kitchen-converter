package com.walkersammarie.converters;

import com.walkersammarie.models.Measurement;
import com.walkersammarie.models.Tablespoon;
import com.walkersammarie.models.Teaspoon;
import org.apache.commons.math3.fraction.Fraction;

import java.util.HashMap;
import java.util.Map;

public class Converter {

    public Map<String, Integer> columnRowValues;
    public Double[][] conversionValues;

    public Converter() {
        setupMap();
        setupTable();
    }

    /* Method to convert the original input value into the chosen conversion */
    public Measurement convert(Measurement original, Measurement conversion) {
            // get column and row numbers based on measurement names
            // check table for converter value
        int rowValue = columnRowValues.get(original.getName());
        int columnValue = columnRowValues.get(conversion.getName());
        Double conversionValue = conversionValues[rowValue][columnValue];
            // multiply original value by conversionValue
            // make a new Fraction with the result value
            // set the value to the conversion object and return it
        double result = original.getValue().doubleValue() * conversionValue;
        Fraction newFraction = new Fraction(result, 8);
        conversion.setValue(newFraction);
        return conversion;
    }

    private void setupMap() {
        columnRowValues = new HashMap<>();
        columnRowValues.put("teaspoon", 0);
        columnRowValues.put("tablespoon", 1);
        columnRowValues.put("cup", 2);
        columnRowValues.put("pint", 3);
        columnRowValues.put("quart", 4);
        columnRowValues.put("gallon", 5);
        columnRowValues.put("fluid ounce", 6);
        columnRowValues.put("mL", 7);
        columnRowValues.put("liter", 8);
    }

    private void setupTable() {
        conversionValues = new Double[][]{{0.0, 0.333334, 0.020834, 0.01041667, 0.00520833, 0.00130208, 0.166667, 4.92899408, 0.00492611},
                {3.0, 0.0, }};
        // START HERE ************************
    }

}