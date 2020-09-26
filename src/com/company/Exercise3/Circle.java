package com.company.Exercise3;

import com.company.Exercise3.Shape;

public class Circle extends Shape {

    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "radius: " + this.radius + "\ncolor: " + this.color
                + "\n" + (this.filled == true ?  "filled" : "not filled") + "\n";
    }
}
