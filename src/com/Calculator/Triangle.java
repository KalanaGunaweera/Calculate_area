package com.Calculator;

public class Triangle {
    public int getHeight() {
        return height;
    }

    public int getBase() {
        return base;
    }

    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    private int base;

    public int calculateAreaTri() {
        return this.base*this.height*(1/2) ;
    }

    public Triangle(int base,int height){
        this.height=height;
        this.base=base;


    }

}
