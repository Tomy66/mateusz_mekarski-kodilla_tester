package com.kodilla.collections.interfaces.homework;

import java.sql.SQLOutput;


public class CarRace {
    public static void main(String[] args) {
        Porsche porsche=new Porsche(100);
        showCarDetails(porsche);
        doRace(porsche);

        Bentley bentley = new Bentley(110);
        showCarDetails(bentley);
        doRace(bentley);

        Tesla tesla = new Tesla(120);
        showCarDetails(tesla);
        doRace(tesla);
    }
    private static void showCarDetails(Car car){
        System.out.println("Aktualna prędkość samochodu wynosi " + car.getSpeed());

    }
    private static void doRace(Car car){
        for ( int i = 0; i < 3; i++){
            car.increaseSpeed();
        }

        for ( int i = 0; i < 2; i++){
            car.decreaseSpeed();
        }

        System.out.println(car.getSpeed());


    }

}
