package com.kodilla.collections.adv.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
        public static void main(String[] args) {
            Principal principal = new Principal("Mr Bean");

            ArrayList<Integer> nrOfKidsInClasses = new ArrayList<>();
            nrOfKidsInClasses.add(20);
            nrOfKidsInClasses.add(15);
            nrOfKidsInClasses.add(30);
            School school = new School(nrOfKidsInClasses, "High school nr 7");

            Map<Principal,School> map = new HashMap<>();
            map.put(principal, school);

            for(Map.Entry<Principal, School> entry : map.entrySet()){
                System.out.println(principal + "is principal of: " + school);
                int sumNrOfKidsInSchool = 0;
                for(int nrOfKidsInClass : entry.getValue().getNrOfKids()){
                    sumNrOfKidsInSchool = sumNrOfKidsInSchool + nrOfKidsInClass;
                }
                System.out.println("There are " + sumNrOfKidsInSchool + " kids in school");
            }
        }
    }


