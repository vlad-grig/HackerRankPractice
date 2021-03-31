package com.company.dataStructures;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        arr[0][0] = -1;
        arr[0][1] = -1;
        arr[0][2] = -1;
        arr[0][3] = 0;
        arr[0][4] = 0;
        arr[0][5] = 0;
        arr[1][0] = 0;
        arr[1][1] = -1;
        arr[1][2] = 0;
        arr[1][3] = -7;
        arr[1][4] = 0;
        arr[1][5] = 0;
        arr[2][0] = -1;
        arr[2][1] = -1;
        arr[2][2] = -1;
        arr[2][3] = 0;
        arr[2][4] = -5;
        arr[2][5] = 0;
        arr[3][0] = 0;
        arr[3][1] = 0;
        arr[3][2] = -2;
        arr[3][3] = -4;
        arr[3][4] = -4;
        arr[3][5] = 0;
        arr[4][0] = 0;
        arr[4][1] = 0;
        arr[4][2] = 0;
        arr[4][3] = -2;
        arr[4][4] = 0;
        arr[4][5] = 0;
        arr[5][0] = 0;
        arr[5][1] = 0;
        arr[5][2] = -1;
        arr[5][3] = -2;
        arr[5][4] = -4;
        arr[5][5] = 0;

        for(int[] ints : arr) {
            for(int j = 0; j < arr.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        int hourglassSum = hourglassSum1(arr);
        System.out.println(hourglassSum);
    }

    private static int hourglassSum1(int[][] arr) {
        int sum;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
