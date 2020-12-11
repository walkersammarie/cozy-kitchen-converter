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
        columnRowValues.put("ml", 7);
        columnRowValues.put("liter", 8);
        columnRowValues.put("gram", 9);
        columnRowValues.put("kilogram", 10);
        columnRowValues.put("ounce", 11);
        columnRowValues.put("pound", 12);
        columnRowValues.put("celsius", 13);
        columnRowValues.put("fahrenheit", 14);
    }

    private void setupTable() {
        conversionValues = new Double[][]{
//                {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}
                // teaspoon
                {0.0, 0.333334, 0.020834, 0.01041667, 0.00520833, 0.00130208, 0.166667, 4.92899408, 0.00492611, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                // tablespoon
                {3.0, 0.0, 0.0625, 0.03125, 0.015625, 0.0039, 0.5, 14.787, 0.01478677, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                // cup
                {48.0, 16.0, 0.0, 0.5, 0.25, 0.0625, 8.0, 236.588, 0.236588, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                // pint
                {96.0, 32.0, 2.0, 0.0, 0.5, 0.125, 16.0, 473.176, 0.473176, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                // quart
                {192.0, 64.0, 4.0, 2.0, 0.0, 0.25, 32.0, 946.353, 0.946353, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                // gallon
                {768.0, 256.0, 16.0, 8.0, 4.0, 0.0, 128.0, 3785.41, 3.78541, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                // fluid ounce
                {6.0, 2.0, 0.125, 0.0625, 0.03125, 0.0078125, 0.0, 29.5735, 0.0295735, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                // mL
                {0.202884, 0.067628, 0.00422675, 0.00211338, 0.00105669, 0.000264172, 0.033814, 0.0, 0.001, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                // liter
                {202.884, 67.628, 4.22675, 2.11338, 1.05669, 0.264172, 33.814, 1000.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                // gram
                {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.001, 0.035274, 0.00220462, 0.0, 0.0},
                // kilogram
                {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, .0, 0.0, 0.0, 0.0, 0.0, 0.0},
                // ounce
                {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                // pound
                {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                // celsius
                {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                // fahrenheit
                {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}
        };
    }

}