package com.company;

import java.util.*;

public class BirthdayCandles {
    public static void main(String[] args) {

        List <Integer> candles = new ArrayList <>();
        candles.add(4);
        candles.add(3);
        candles.add(2);
        candles.add(4);
        candles.add(1);
        candles.add(5);
        candles.add(2);
        candles.add(1);
        candles.add(3);
        candles.add(3);
        candles.add(3);
        candles.add(3);
        int cakeCandles = birthdayCakeCandles(candles);
        System.out.println(cakeCandles);

        int candles2 = birthdayCakeCandles2(candles);
        System.out.println(candles2);
    }

    //this function is faster but not enough faster for HackerRank(only 80%)
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

    //this function is lower than the first one
    static int birthdayCakeCandles2(List <Integer> candles) {
        int max = 0;
        for(int i = 0; i < candles.size(); i++) {
            int number = candles.get(i);
            int count = 0;
            for(int currentElement : candles) {
                if (number == currentElement) {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                }
            }
        }
        return max;
    }
}
