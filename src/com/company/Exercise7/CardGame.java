package com.company.Exercise7;

import java.util.List;

public class CardGame {

    private List<Integer> list1;
    private List<Integer> list2;
    private int count = 0;

    public CardGame(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public void startGame() {
        while (true) {
            if (list1.size() == 0 || list2.size() == 0) {
                break;
            }
            if (list1.get(0) > list2.get(0) && list2.get(0) != 0 && list1.get(0) != 9
                    || list1.get(0) == 0 && list2.get(0) == 9) {
                list1.add(list1.get(0));
                list1.add(list2.get(0));
                list1.remove(0);
                list2.remove(0);
            } else {
                list2.add(list2.get(0));
                list2.add(list1.get(0));
                list2.remove(0);
                list1.remove(0);
            }
            count++;
            if (count == 106) {
                System.out.println("botva");
                return;
            }
        }
        if (list1.size() == 0) {
            System.out.println("second " + count);
        } else {
            System.out.println("first " + count);
        }
    }
}
