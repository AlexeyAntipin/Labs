package com.company.Exercise2;

import com.company.Exercise2.Ball2;

public class Ball2Tester {
    public static void test() {
        Ball2 ball = new Ball2(5, 10);
        Ball2 ball2 = new Ball2();
        Ball2 ball3 = new Ball2();
        ball2.setX(3);
        ball2.setY(5);
        ball3.setXY(1, 0);
        ball3.move(5, 5);
        System.out.println(ball.toString() + "\n" + ball2.toString() + "\n" + ball3.toString());
    }
}
