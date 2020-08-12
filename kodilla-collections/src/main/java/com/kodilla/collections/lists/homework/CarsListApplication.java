package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Porsche;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Porsche> cars = new ArrayList<>();
        cars.add(new Porsche(100));
        cars.add(new Porsche(80));
        cars.add(new Porsche(90));
        cars.add(new Porsche(110));
        cars.add(new Porsche(120));

        cars.remove(3);
        //cars.remove();
        System.out.println(cars.size());

        for (Porsche porsche : cars){
            if (porsche.getSpeed()>70)
                System.out.println(porsche + " Car speed is : " + porsche.getSpeed());

        }

    }
}
