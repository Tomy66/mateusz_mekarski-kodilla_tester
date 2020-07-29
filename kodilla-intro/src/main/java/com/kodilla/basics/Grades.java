package com.kodilla.basics;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }


    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int returnLast() {
        return this.grades[size - 1];

    }

    public double getAverage() {
        double marks = 0;
        for (int grade : grades) {
            marks = marks + grade;
        }
        return marks / this.size;


    }
}

