package com.kodilla.inheritance.homework;

public class CodeActivation {
    public static void main(String[] args) {
        OperatingSystem windows = new Windows();
        OperatingSystem linux = new Linux();

        windows.TurnOnSystem();
        windows.DisplayPriceOfSystem();
        windows.DisplayYearOfProduction();
        windows.TurnOffSystem();

        linux.TurnOnSystem();
        linux.DisplayPriceOfSystem();
        linux.DisplayYearOfProduction();
        linux.TurnOffSystem();

    }
}
