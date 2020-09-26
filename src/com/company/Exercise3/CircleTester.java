package com.company.Exercise3;

public class CircleTester {
    public static void test() {
        Circle circle = new Circle();
        Circle circle1 = new Circle(5.0);
        Shape circle2 = new Circle(10.0, "red", true);
        circle.setRadius(3);
        circle.setColor("green");
        circle.setFilled(false);
        circle1.setColor("blue");
        circle1.setFilled(true);
        System.out.println("Circle: " + circle.toString());
        System.out.println("Circle1: " + circle1.toString());
        System.out.println("Circle2: " + circle2.toString());
    }
}
