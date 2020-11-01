package com.walkersammarie.view;

public interface BasicUI {

    void output(String content);

    void pauseOutput();

    int promptForInt(String prompt);

    String promptForString(String prompt);

    String promptForSelection(String[] options);

}
