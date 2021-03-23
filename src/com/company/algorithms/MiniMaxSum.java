package com.company.algorithms;

import java.util.Arrays;

public class MiniMaxSum {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 7;
        arr[1] = 69;
        arr[2] = 2;
        arr[3] = 221;
        arr[4] = 8974;
        miniMaxSum(arr);
        miniMaxSum2(arr);

    }

    private static void miniMaxSum2(int[] arr) {
        long sum = 0;
        long maxSum = 0;
        long minSum = 0;
        minSum = arr[0];
        maxSum = arr[0];
        for(int i : arr) {
            sum += i;
            if (minSum > i) {
                minSum = i;
            }
            if (maxSum < i) {
                maxSum = i;
            }
        }
        System.out.println((sum - maxSum) + " " + (sum - minSum));
    }

    static void miniMaxSum(int[] arr) {
        int minSum = 0;
        int maxSum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        for(int index = 0; index < arr.length; index++) {
            sum1 = arr[1] + arr[2] + arr[3] + arr[4];
            sum2 = arr[0] + arr[2] + arr[3] + arr[4];
            sum3 = arr[0] + arr[1] + arr[3] + arr[4];
            sum4 = arr[0] + arr[1] + arr[2] + arr[4];
            sum5 = arr[0] + arr[1] + arr[2] + arr[3];
        }
        if (sum1 < sum2 && sum1 < sum3 && sum1 < sum4 && sum1 < sum5) {
            minSum = sum1;
        } else if (sum2 < sum3 && sum2 < sum4 && sum2 < sum5 && sum2 < sum1) {
            minSum = sum2;
        } else if (sum3 < sum1 && sum3 < sum2 && sum3 < sum4 && sum3 < sum5) {
            minSum = sum3;
        } else if (sum4 < sum1 && sum4 < sum2 && sum4 < sum3 && sum4 < sum5) {
            minSum = sum4;
        } else if (sum5 < sum1 && sum5 < sum2 && sum5 < sum3 && sum5 < sum4) {
            minSum = sum5;
        }

        if (sum1 > sum2 && sum1 > sum3 && sum1 > sum4 && sum1 > sum5) {
            maxSum = sum1;
        } else if (sum2 > sum3 && sum2 > sum4 && sum2 > sum5 && sum2 > sum1) {
            maxSum = sum2;
        } else if (sum3 > sum1 && sum3 > sum2 && sum3 > sum4 && sum3 > sum5) {
            maxSum = sum3;
        } else if (sum4 > sum1 && sum4 > sum2 && sum4 > sum3 && sum4 > sum5) {
            maxSum = sum4;
        } else if (sum5 > sum1 && sum5 > sum2 && sum5 > sum3 && sum5 > sum4) {
            maxSum = sum5;
        }

        System.out.println(minSum + " " + maxSum);
    }
}
