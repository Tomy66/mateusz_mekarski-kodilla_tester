package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Tree",20,true));
        stamps.add(new Stamp("Castle",10,false));
        stamps.add(new Stamp("Bridge",25,false));
        stamps.add(new Stamp("Tree",20,true));
        System.out.println(stamps.size());
        for (Stamp stamp : stamps){
            System.out.println(stamp);
        }

    }
}
