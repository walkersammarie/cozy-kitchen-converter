package com.walkersammarie;

import com.walkersammarie.view.BasicUI;
import com.walkersammarie.view.MenuDrivenCLI;

public class App {

    // Main Menu Options
    private static final String VOLUME = "Volume";
    private static final String WEIGHT = "Weight";
    private static final String TEMP = "Temperature";
    private static final String EXIT = "Exit";
    private static final String[] MAIN_MENU_OPTIONS = {VOLUME, WEIGHT, TEMP, EXIT};

    private static final String BACK_TO_MAIN_MENU = "Back to Main Menu";
    private static final String MENU_MESSAGE = "Hello and welcome to the Cozy Kitchen Converter!\n" +
            "Please choose the unit you already have and wish to convert.";

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

    public App(BasicUI ui) {
        this.ui = ui;
    }

    public static void main( String[] args ) {
        BasicUI cli = new MenuDrivenCLI();
        App app = new App(cli);
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
                ui.output("Thanks for using the Cozy Kitchen Calculator. Come back soon!");
                running = false;
            }
        }
    }

    private void displayVolumeMenu() {
        boolean running = true;
        while (running) {
            String selection = ui.promptForSelection(VOLUME_MENU_OPTIONS);
            if (selection.equals(TEASPOON)) {

            } else if (selection.equals(TABLESPOON)) {

            } else if (selection.equals(CUP)) {

            } else if (selection.equals(PINT)) {

            } else if (selection.equals(QUART)) {

            } else if (selection.equals(GALLON)) {

            } else if (selection.equals(FLUID_OUNCE)) {

            } else if (selection.equals(ML)) {

            } else if (selection.equals(LITER)) {

            } else if (selection.equals(BACK_TO_MAIN_MENU)) {
                running = false;
            }
        }
    }

    private void displayWeightMenu() {
        boolean running = true;
        while (running) {
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

}
