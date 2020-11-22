package com.walkersammarie.view;

import java.util.Scanner;

public class MenuDrivenCLI implements BasicUI {

    private final Scanner userInput = new Scanner(System.in);
    private final Menu menu = new Menu(System.in, System.out);

    @Override
    public void output(String content) {
        System.out.println(); //Print blank line
        System.out.println(content);
    }

    @Override
    public void pauseOutput() {
        System.out.print("(Press enter to continue)");
        userInput.nextLine();
    }

    @Override
    public String promptForSelection(String[] options) {
        return (String) menu.getChoiceFromOptions(options);
    }

    @Override
    public String promptForString(String prompt) {
        System.out.print(prompt);
        while (true) {
            try {
                return userInput.nextLine();
            } catch (NumberFormatException e) {
                System.out.print("\nInvalid input, please try again: ");
            }
        }
    }

    @Override
    public int promptForInt(String prompt) {
        System.out.print(prompt);
        while (true) {
            try {
                int result = Integer.parseInt(userInput.nextLine());
                if(result >= 0){
                    return result;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.print("\nInvalid value, please try again: ");
            }
        }
    }
}