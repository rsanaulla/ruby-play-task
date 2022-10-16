package com.github.rsanaulla;

public class Limits {
    double upperLimit;
    double lowerLimit;
    int hits = 0;

    public Limits(double upper, double lower) {
        upperLimit = upper;
        lowerLimit = lower;
    }

    public boolean isInside(double value) {
        return value >= lowerLimit && value <= upperLimit;
    }

    public void hit() {
        hits += 1;
    }
}