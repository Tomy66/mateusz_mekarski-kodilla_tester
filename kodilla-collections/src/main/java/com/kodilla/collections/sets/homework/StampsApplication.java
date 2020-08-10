package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Tree","20x30","Stamped"));
        stamps.add(new Stamp("Castle","10x30","Not Stamped"));
        stamps.add(new Stamp("Bridge","25x30","Not Stamped"));
        stamps.add(new Stamp("Tree","20x30","Stamped"));
        System.out.println(stamps.size());
        for (Stamp stamp : stamps);
        System.out.println(stamps);
    }
}
