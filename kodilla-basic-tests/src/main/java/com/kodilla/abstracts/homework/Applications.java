package com.kodilla.abstracts.homework;

public class Applications {
    public static void main(String[] args) {
        Square task1 = new Square();
        task1.a = 5;
        System.out.println("Square surface area = " + task1.surfaceArea());
        System.out.println("Square circuit = " + task1.circuit());

        Rectangle task2 = new Rectangle();
        task2.a= 2;
        task2.b= 4;
        System.out.println("Rectangle surface area = " + task2.surfaceArea());
        System.out.println("Rectangle circuit = " + task2.circuit());
    }



}
