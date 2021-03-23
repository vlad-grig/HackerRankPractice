package com.company.dataStructures;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    public static void main(String[] args) {

        int[] a = new int[10];
        a[0] = 4;
        a[1] = 5;
        a[2] = 6;
        a[3] = 7;
        a[4] = 8;
        a[5] = 9;
        a[6] = 10;
        a[7] =11;
        a[8] = 12;



        System.out.println(Arrays.toString(a));
        int[] reverseArray = reverseArray(a);
        System.out.println(Arrays.toString(reverseArray));
    }

    private static int[] reverseArray(int[] a) {
        int x = 0;
        for(int index = 0; index< a.length/2; index++){
            x=a[index];
            a[index] = a[(a.length)-(index+1)];
            a[a.length-(index+1)] = x;
        }
        return a;
    }
}
