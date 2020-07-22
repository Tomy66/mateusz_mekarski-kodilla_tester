package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int price;
    private int year;

    public OperatingSystem(int price,int year){
        this.price=price;
        this.year=year;
    }
    public void TurnOnSystem(){
        System.out.println("System is turned on");
    }
    public void TurnOffSystem(){
        System.out.println("System is turned off");
    }
    public int getPrice(){
        return price;
    }
    public int getYear(){
        return year;
    }
    public void DisplayYearOfProduction(){
        System.out.println("System was produced in " + year);
    }
    public void DisplayPriceOfSystem(){
        System.out.println("The price of the system is " + price);
    }
}
