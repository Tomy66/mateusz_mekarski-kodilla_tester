package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampDimensions;
    private boolean stamped;

    public Stamp(String stampName, double stampDimensions, boolean  stamped){
        this.stampName = stampName;
        this.stampDimensions = stampDimensions;
        this.stamped=stamped;
    }

    public String getStampName() {
        return stampName;
    }
    public double getStampDimensions(){
        return  stampDimensions;
    }
    public boolean getStamped(){
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(stampName, stamp.stampName) &&
                Objects.equals(stampDimensions, stamp.stampDimensions) &&
                Objects.equals(stamped, stamp.stamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampDimensions, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampDimensions='" + stampDimensions + '\'' +
                ", stamped='" + stamped + '\'' +
                '}';
    }
}
