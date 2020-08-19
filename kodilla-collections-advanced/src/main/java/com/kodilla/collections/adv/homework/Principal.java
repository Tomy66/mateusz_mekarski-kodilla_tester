package com.kodilla.collections.adv.homework;

import java.util.Objects;

public class Principal {
    private String name;


    public Principal(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Principal{" + name + '\'' +
                '}';
    }
}
