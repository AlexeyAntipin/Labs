package com.company.Exercise5;

public class Number1 {

    public static void print(int n, int k) {

        if (n == 0) return;

        for (int i = 1; i <= k; i++) {
            System.out.print(k + " ");
            n--;
            if (n <= 0) return;
        }

        k++;

        print(n, k);
    }
}
