package com.kodilla.inheritance.homework;

public class CodeActivation {
    public static void main(String[] args) {
        OperatingSystem windows = new Windows();
        OperatingSystem linux = new Linux();

        windows.turnOnSystem();
        windows.displayPriceOfSystem();
        windows.displayYearOfProduction();
        windows.turnOffSystem();

        linux.turnOnSystem();
        linux.displayPriceOfSystem();
        linux.displayYearOfProduction();
        linux.turnOffSystem();

    }
}
