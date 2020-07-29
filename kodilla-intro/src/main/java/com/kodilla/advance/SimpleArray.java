package com.kodilla.advance;

public class SimpleArray {
    public static void main(String[] args) {
        String[] friends = new String[5];
        friends[0]= "Monika";
        friends[1]= "Sylwia";
        friends[2]= "Hubert";
        friends[3]= "Michał";
        friends[4]= "Krystian";
        String friend = friends[3];
        System.out.println(friend);
        int numberOfElements = friends.length;
        System.out.print("Liczba elementów w mojej tablicy to:");
        System.out.println(numberOfElements);







    }
}
