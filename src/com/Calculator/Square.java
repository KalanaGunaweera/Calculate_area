package com.Calculator;

public class Square {
    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int weight;

    public int calculateAreaSqu() {
        return this.height*this.weight;
    }
    public Square(int height,int weight){
        this.height=height;
        this.weight=weight;
    }
}
