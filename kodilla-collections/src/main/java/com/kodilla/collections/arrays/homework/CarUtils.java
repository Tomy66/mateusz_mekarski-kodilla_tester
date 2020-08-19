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
        Car car = createCar();
        System.out.println(car);
        System.out.println(drawCar());
        String[] carBrands = new String[5];
        carBrands[0]="Jaguar";
        carBrands[1]="Maserati";
        carBrands[2]="Audi";
        carBrands[3]="Seat";
        carBrands[4]="Subaru";
        for (int i = 0 ; i< carBrands.length ; i++){
            String information = carBrands[i];
            System.out.println( information);
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


}
