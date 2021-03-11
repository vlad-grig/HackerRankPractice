package com.company;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public static void main(String[] args) {
        List <Integer> a = new ArrayList <>();
        List <Integer> b = new ArrayList <>();
        List <Integer> c = new ArrayList <>();
        int aScore = 0;
        int bScore = 0;
        a.add(1);
        a.add(3);
        a.add(5);
        b.add(2);
        b.add(3);
        b.add(1);
        for(int index = 0; index < 3; index++) {
            if (a.get(index) > b.get(index)) {
                aScore++;
            } else if (a.get(index) < b.get(index)) {
                bScore++;
            }
        }
        c.add(aScore);
        c.add(bScore);
        System.out.println(c);
    }
}
