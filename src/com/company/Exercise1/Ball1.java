package com.company.Exercise1;

public class Ball1 {

    private String type;
    private String color;
    private double price;
    private double radius;

    public Ball1(String type, String color, double price, double radius) {
        this.type = type;
        this.color = color;
        this.price = price;
        this.radius = radius;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", radius=" + radius +
                '}' + "\n";
    }

    public double volume() {
        return Math.PI * radius * radius * radius * 4 / 3;
    }
}
