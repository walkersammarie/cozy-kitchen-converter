package com.walkersammarie;

import com.walkersammarie.converters.Converter;
import com.walkersammarie.converters.IOConverter;
import com.walkersammarie.models.Measurement;
import com.walkersammarie.models.Tablespoon;
import com.walkersammarie.models.Teaspoon;
import com.walkersammarie.view.BasicUI;
import com.walkersammarie.view.MenuDrivenCLI;
import org.apache.commons.math3.fraction.Fraction;

public class App {

    // Main Menu Options
    private static final String VOLUME = "Volume";
    private static final String WEIGHT = "Weight";
    private static final String TEMP = "Temperature";
    private static final String EXIT = "Exit";
    private static final String[] MAIN_MENU_OPTIONS = {VOLUME, WEIGHT, TEMP, EXIT};

    private static final String BACK_TO_MAIN_MENU = "Back to Main Menu";
    private static final String MENU_MESSAGE = "Hello and welcome to the Cozy Kitchen Converter!";

    // Volume Menu Options
    private static final String TEASPOON = "Teaspoon";
    private static final String TABLESPOON = "Tablespoon";
    private static final String CUP = "Cup";
    private static final String PINT = "Pint";
    private static final String QUART = "Quart";
    private static final String GALLON = "Gallon";
    private static final String FLUID_OUNCE = "Fluid Ounce";
    private static final String ML = "mL";
    private static final String LITER = "Liter";
    private static final String[] VOLUME_MENU_OPTIONS = {TEASPOON, TABLESPOON, CUP, PINT,
            QUART, GALLON, FLUID_OUNCE, ML, LITER, BACK_TO_MAIN_MENU};

    // Weight Menu Options
    private static final String GRAM = "Gram";
    private static final String KILOGRAM = "Kilogram";
    private static final String OUNCE = "Ounce";
    private static final String POUND = "Pound";
    private static final String[] WEIGHT_MENU_OPTIONS = {GRAM, KILOGRAM, OUNCE, POUND, BACK_TO_MAIN_MENU};

    // Temp Menu Options
    private static final String CELSIUS = "Celsius";
    private static final String FAHRENHEIT = "Fahrenheit";
    private static final String[] TEMP_MENU_OPTIONS = {CELSIUS, FAHRENHEIT, BACK_TO_MAIN_MENU};

    private final BasicUI ui;
    private final Converter converter;
    private final IOConverter ioConverter;

    public App(BasicUI ui, Converter converter, IOConverter ioConverter) {
        this.ui = ui;
        this.converter = converter;
        this.ioConverter = ioConverter;
    }

    public static void main(String[] args) {
        BasicUI cli = new MenuDrivenCLI();
        Converter converter = new Converter();
        IOConverter ioConverter = new IOConverter();
        App app = new App(cli, converter, ioConverter);
        app.run();
    }

    private void run() {
        ui.output(MENU_MESSAGE);
        boolean running = true;
        while (running) {
            String selection = ui.promptForSelection(MAIN_MENU_OPTIONS);
            if (selection.equals(VOLUME)) {
                displayVolumeMenu();
            } else if (selection.equals(WEIGHT)) {
                displayWeightMenu();
            } else if (selection.equals(TEMP)) {
                displayTempMenu();
            } else if (selection.equals(EXIT)) {
                ui.output("Thanks for using the Cozy Kitchen Converter. Come back soon!");
                running = false;
            }
        }
    }

    private void displayVolumeMenu() {
        boolean running = true;
        while (running) {
            ui.output("Please choose the unit you already have and wish to convert.");
            String selection = ui.promptForSelection(VOLUME_MENU_OPTIONS);
            if (selection.equals(BACK_TO_MAIN_MENU)) {
                running = false;
            } else {
                Measurement originalMeasurement = makeMeasurementObject(selection);
                Fraction originalFraction = null;
                while (originalFraction == null) {
                    String input = ui.promptForString("\nEnter a whole number (ex: '4') or a fraction (ex: '3/4' or '1 1/3'): ");
                    originalFraction = ioConverter.stringToFraction(input);
                    if (originalFraction == null) {
                        ui.output("*** INVALID INPUT PLEASE TRY AGAIN ***");
                    }
                }
                originalMeasurement.setValue(originalFraction);
                displayVolumeSubMenu(selection, originalMeasurement);
                running = false;
            }
        }
    }

    private void displayVolumeSubMenu(String firstSelection, Measurement original) {
        boolean running = true;
        while (running) {
            ui.output("Please choose the unit you wish to convert to.");
            String secondSelection = ui.promptForSelection(VOLUME_MENU_OPTIONS);
            if (secondSelection.equals(firstSelection)) {
                ui.output("Please select a different measurement than the original.");
            } else if (secondSelection.equals(BACK_TO_MAIN_MENU)) {
                running = false;
            } else {
                Measurement toConvert = makeMeasurementObject(secondSelection);
                Measurement converted = converter.convert(original, toConvert);
                ui.output(ioConverter.generateResultSentence(original, converted));
                ui.pauseOutput();
                running = false;
            }
        }
    }

    private void displayWeightMenu() {
        boolean running = true;
        while (running) {
            ui.output("Please select the ");
            String selection = ui.promptForSelection(WEIGHT_MENU_OPTIONS);
            if (selection.equals(GRAM)) {

            } else if (selection.equals(KILOGRAM)) {

            } else if (selection.equals(OUNCE)) {

            } else if (selection.equals(POUND)) {

            } else if (selection.equals(BACK_TO_MAIN_MENU)) {
                running = false;
            }
        }
    }

    private void displayTempMenu() {
        boolean running = true;
        while (running) {
            String selection = ui.promptForSelection(TEMP_MENU_OPTIONS);
            if (selection.equals(CELSIUS)) {

            } else if (selection.equals(FAHRENHEIT)) {

            } else if (selection.equals(BACK_TO_MAIN_MENU)) {
                running = false;
            }
        }
    }

    private Measurement makeMeasurementObject(String selection) {
        Measurement result;
        if (selection.equals(TEASPOON)) {
            result = new Teaspoon();
        } else if (selection.equals(TABLESPOON)) {
            result = new Tablespoon();
        } else {
            result = null;
        }
        //else if (selection.equals(CUP)) {
//
//        } else if (selection.equals(PINT)) {
//
//        } else if (selection.equals(QUART)) {
//
//        } else if (selection.equals(GALLON)) {
//
//        } else if (selection.equals(FLUID_OUNCE)) {
//
//        } else if (selection.equals(ML)) {
//
//        } else if (selection.equals(LITER)) {
//
//        }
        return result;
    }

}
