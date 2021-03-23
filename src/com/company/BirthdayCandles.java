package com.company;

import java.util.*;

public class BirthdayCandles {
    public static void main(String[] args) {

        List <Integer> candles = new ArrayList <>();
        candles.add(18);
        candles.add(90);
        candles.add(90);
        candles.add(13);
        candles.add(90);
        candles.add(75);
        candles.add(90);
        candles.add(8);
        candles.add(90);
        candles.add(43);

        int cakeCandles = birthdayCakeCandles1(candles);
        System.out.println(cakeCandles);

        int candles2 = birthdayCakeCandles2(candles);
        System.out.println(candles2);
    }

    //my solution
    static int birthdayCakeCandles1(List <Integer> candles) {
        int countTallest = 0;
        int tallest = 0;
        candles.sort(Collections.reverseOrder());
        tallest = candles.get(0);
        for(Integer candle : candles) {
            if (tallest == candle) {
                countTallest++;
            } else {
                break;
            }
        }
        return countTallest;
    }

    //same result but... 1 line instead of 10
    static int birthdayCakeCandles2(List <Integer> candles) {
        return Collections.frequency(candles, Collections.max(candles));
    }
}
