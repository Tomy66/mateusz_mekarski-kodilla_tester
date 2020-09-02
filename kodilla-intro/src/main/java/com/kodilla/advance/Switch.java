package com.kodilla.advance;

import java.util.Scanner;

public class Switch {

    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first letter: ");
        String letter = scanner.nextLine();
        return letter;
    }

    public static void main(String[] args) {
        colors myColors = colors.R;
        switch (myColors) {
            case Y:
                System.out.println("Yellow");
                break;
            case R:
                System.out.println("Red");
                break;
            case B:
                System.out.println("Blue");
                break;
            case W:
                System.out.println("White");
                break;
        }
    }

}
