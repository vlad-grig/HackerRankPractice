package com.company;

import java.util.*;

public class BirthdayCandles {
    public static void main(String[] args) {

        List <Integer> candles = new ArrayList <>();
        candles.add(4);
        candles.add(1);
        candles.add(2);
        candles.add(4);
        candles.add(1);
        candles.add(5);
        candles.add(2);
        candles.add(4);
        candles.add(4);
        int cakeCandles = birthdayCakeCandles(candles);
        System.out.println(cakeCandles);
    }

    static int birthdayCakeCandles(List <Integer> candles) {
        int numberOfCandles = 0;
        Set <Integer> setList = new HashSet <>(candles);
        for(Integer next : setList) {
            int count = 0;
            for(Integer number : candles) {
                if (next.equals(number)) {
                    count++;
                    if (numberOfCandles < count) {
                        numberOfCandles = count;
                    }
                }
            }
        }
        return numberOfCandles;
    }
}
