package com.company.dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayGame {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList <>();
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(8);
        list.add(5);
        int countMoves = countMoves(list);
        System.out.println(countMoves);
    }

    private static int countMoves(List <Integer> list) {
        int moves = 0;
        list.sort(Collections.reverseOrder());
        while (!list.get(0).equals(list.get(list.size() - 1))) {
            moves++;
            for(int index = 1; index < list.size(); index++) {
                Integer currentElement = list.get(index);
                currentElement += 1;
                list.set(index, currentElement);
            }
            list.sort(Collections.reverseOrder());
        }
        return moves;
    }
}
