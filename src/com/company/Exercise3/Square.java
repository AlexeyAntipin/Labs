package com.company.Exercise3;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        this.width = this.length = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(double side) {
        this.width = this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = this.length = side;
    }

    @Override
    public String toString() {
        return "Side: " + this.width + "\n";
    }
}
