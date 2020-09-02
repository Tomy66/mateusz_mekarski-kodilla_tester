package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Bentley;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Porsche;
import com.kodilla.collections.interfaces.homework.Tesla;

import java.util.Random;


public class CarUtils {
    static Random random = new Random();
    private static Car createCar() {
        int randomNumber = random.nextInt(3);
        if (randomNumber == 0) {
            return new Bentley(random.nextInt(100));
        }
        else if (randomNumber ==1){
            return  new Porsche(random.nextInt(110));
        }
        else {
            return new Tesla(random.nextInt(120));
        }
    }

    public static void main(String[] args) {
        int sizeOfArray = random.nextInt(15)+1;
        Car[] cars = new Car[sizeOfArray];
        for (int i =0; i< sizeOfArray; i++) {
            cars[i] = createCar();
        }

        for (Car car: cars){
            describeCar(car);
        }



    }

    public static Car drawCar() {
        Car car = createCar();
        int number= random.nextInt(15);
        for (int i = 0; i < number; i++){
            car.increaseSpeed();
        }
        return car;
    }

    public static void describeCar(Car car){
        System.out.println("Car kind: " + getCarName(car)+ "Car speed: " +car.getSpeed());

    }

    public static String getCarName(Car car){
        if ( car instanceof Porsche)
            return "Porsche";
        else if (car instanceof Tesla)
            return "Tesla";
        else
            return "Bentley";
    }



}
