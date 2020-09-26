package com.company.Exercise5;

public class Number2 {

    public static void print(int n, int k) {
        if (n == 0) return;
        System.out.print(k + " ");
        n--;
        k++;
        print(n, k);
    }
}
