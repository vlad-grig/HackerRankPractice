package com.company.algorithms;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

public class PlusMinus {

    public static void main(String[] args) {
        int[] arr = getInts();
        plusMinus(arr);
    }

    private static int[] getInts() {
        int[] arr = new int[9];
        for(int index = 0; index < arr.length; index++) {
            int min = -5;
            int max = 5;
            int random_int = (int) (Math.random() * (max - min + 1) + min);
            arr[index] = random_int;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    static void plusMinus(int[] arr) {
        double totalPositive = 0;
        double totalNegative = 0;
        double totalZero = 0;
        for(int currentElement : arr) {
            if (currentElement > 0) {
                totalPositive += 1;
            } else if (currentElement < 0) {
                totalNegative += 1;
            } else {
                totalZero += 1;
            }
        }

        System.out.print(String.format("%.6g%n", (totalPositive / arr.length)));
        System.out.print(String.format("%.6g%n", (totalNegative / arr.length)));
        System.out.print(String.format("%.6g%n", (totalZero / arr.length)));

    }
}
