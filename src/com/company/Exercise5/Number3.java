package com.company.Exercise5;

public class Number3 {

    public static void print (int a, int b) {
        if (a == b) {
            System.out.print(a);
            return;
        }

        if (a < b) {
            System.out.print(a + " ");
            a++;
            print(a, b);
        }

        if (a > b) {
            System.out.print(a + " ");
            a--;
            print(a, b);
        }
    }
}
