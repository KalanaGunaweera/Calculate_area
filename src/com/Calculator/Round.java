package com.Calculator;

public class Round {
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;

    public int calculateAreaRou() {
        return this.radius*this.radius*22/7;
    }
    public Round(int radius){
        this.radius=radius;

    }
}
