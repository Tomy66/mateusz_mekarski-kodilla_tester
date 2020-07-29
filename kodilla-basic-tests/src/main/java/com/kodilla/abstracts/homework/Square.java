package com.kodilla.abstracts.homework;

public class Square extends Shape{
    public double a;
    public double surfaceArea(){
        return a*a;
    }
    public double circuit(){
        return 4*a;
    }

}
