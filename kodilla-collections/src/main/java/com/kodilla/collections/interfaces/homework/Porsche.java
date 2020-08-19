package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Porsche implements Car {
    double speed;

    public Porsche(int speed) {
        this.speed=speed;

    }

    public Porsche() {

    }


    public double getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed= 2 * speed;
    }
    public void decreaseSpeed() {
        speed = speed/2;

    }

    @Override
    public String toString() {
        return "Porsche{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Porsche porsche = (Porsche) o;
        return Double.compare(porsche.speed, speed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
