package com.kodilla.collections.adv.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();
        Student john = new Student("John","Stevenson");
        Student charlie = new Student("Charlie","McDonald");
        Student katy = new Student("Katy","Bush");

        Grades johnGrades = new Grades(5.0,4.0,3.5,4.0);
        Grades charlieGrades = new Grades(5.0,4.0,3.5,4.0);
        Grades katyGrades = new Grades(5.0,4.0,3.5,4.0);

        school.put(john,johnGrades);
        school.put(charlie,charlieGrades);
        school.put(katy,katyGrades);

        System.out.println(school.get(john));
    }
}
