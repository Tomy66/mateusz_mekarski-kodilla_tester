package com.kodilla.collections.adv.homework;



import java.util.ArrayList;


public class School {

    private ArrayList<Integer> nrOfKids;
    private String name;

    public School(ArrayList<Integer> nrOfKids, String name){
        this.nrOfKids = nrOfKids;
        this.name = name;
    }
    public ArrayList<Integer> getNrOfKids(){
        return nrOfKids;
    }

    @Override
    public String toString() {
        return "School{" +
                "nrOfKids=" + nrOfKids +
                ", name='" + name + '\'' +
                '}';
    }
}
