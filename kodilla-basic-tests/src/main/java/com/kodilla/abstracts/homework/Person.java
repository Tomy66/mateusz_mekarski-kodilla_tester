package com.kodilla.abstracts.homework;

public class Person {
    public static void main(String[] args) {
        Job teacher = new Teacher("Teaching young people", 4000);
        Job journalist = new Journalist("Writing an article", 5000);

        Journalist journalist1 = new Journalist("The journalist conducting interviews", 7000);
        journalist1.displayJobInformation();

        Teacher teacher1 = new Teacher("The teacher transmits knowledge ", 5000);
        teacher1.displayJobInformation();

    }
}
