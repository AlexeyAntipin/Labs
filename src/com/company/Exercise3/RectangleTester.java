package com.company.Exercise3;

public class RectangleTester {
    public static void test() {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(1.0, 5.0);
        Shape rectangle2 = new Rectangle(3.0, 10.0, "red", true);
        rectangle.setWidth(15.0);
        rectangle.setLength(6.0);
        rectangle.setColor("green");
        rectangle.setFilled(false);
        rectangle1.setColor("black");
        rectangle2.setFilled(true);
        System.out.println("Rectangle: " + rectangle.toString());
        System.out.println("Rectangle1: " + rectangle1.toString());
        System.out.println("Rectangle2: " + rectangle2.toString());
    }
}
