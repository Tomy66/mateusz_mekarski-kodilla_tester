package com.kodilla.collections.interfaces.homework;

public class Bentley implements Car{

    double speed;

    public Bentley(int speed) {
        this.speed=speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void increaseSpeed() {

        speed = 2 * speed;
    }

    public void decreaseSpeed() {
        speed = speed/2;

    }
}
