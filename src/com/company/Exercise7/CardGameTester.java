package com.company.Exercise7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardGameTester {
    public static void test() {
        Scanner in = new Scanner(System.in);
        List<Integer> first = new ArrayList<>();
        first.add(in.nextInt());
        first.add(in.nextInt());
        first.add(in.nextInt());
        first.add(in.nextInt());
        first.add(in.nextInt());
        List<Integer> second = new ArrayList<>();
        second.add(in.nextInt());
        second.add(in.nextInt());
        second.add(in.nextInt());
        second.add(in.nextInt());
        second.add(in.nextInt());
        new CardGame(first, second).startGame();
    }
}
