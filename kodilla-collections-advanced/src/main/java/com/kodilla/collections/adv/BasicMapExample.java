package com.kodilla.collections.adv;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Math", 5.0);
        grades.put("Physics", 4.0);
        grades.put("Philosophy", 5.0);

        Double grade = grades.get("Math");
        System.out.println(grade);

        for (Map.Entry<String,Double> note : grades.entrySet()){
            System.out.println("Grade of " + note.getKey()+ "is equal to "+ note.getValue());

        }
    }
}
