package com.company.Exercise3;

public class SquareTester {
    public static void test() {
        Square square = new Square();
        Square square1 = new Square(5.0);
        Shape square2 = new Square(6.0, "red", true);
        square.setSide(1);
        square.setColor("green");
        square.setFilled(false);
        square1.setColor("white");
        square1.setFilled(true);
        System.out.println("Square: " + square.toString());
        System.out.println("Square1: " + square1.toString());
        System.out.println("Square2: " + square2.toString());
    }
}
