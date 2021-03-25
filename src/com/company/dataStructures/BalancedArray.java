package com.company.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class BalancedArray {
    public static void main(String[] args) {

        List <Integer> arr = new ArrayList <>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(7);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(7);
        arr.add(3);
        arr.add(11);
        arr.add(6);
        arr.add(3);

        int pivotIndex = balancedSum(arr);
        System.out.println(pivotIndex);
    }

    private static int balancedSum(List <Integer> arr) {
        int pivotIndex = 0;
        int pivotValue = 0;
        int totalSumArray = 0;
        int sumLeftPivot = 0;
        int sumRightPivot = 0;
        for(Integer integer : arr) {
            totalSumArray += integer;
        }
        for(int index = 0; index < arr.size(); index++) {
            sumLeftPivot += arr.get(index);
            pivotValue = arr.get(index + 1);
            sumRightPivot = totalSumArray - sumLeftPivot - pivotValue;
            if (sumLeftPivot == sumRightPivot) {
                pivotIndex = index + 1;
                break;
            }
        }
        return pivotIndex;
    }
}
