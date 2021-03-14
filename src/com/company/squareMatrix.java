package com.company;

import java.util.ArrayList;
import java.util.List;

public class squareMatrix {

    public static void main(String[] args) {
        List <List <Integer>> arr = new ArrayList <>();
        List <Integer> a = new ArrayList <>();
        List <Integer> b = new ArrayList <>();
        List <Integer> c = new ArrayList <>();
        a.add(11);
        a.add(2);
        a.add(4);
        b.add(4);
        b.add(5);
        b.add(6);
        c.add(10);
        c.add(8);
        c.add(-12);
        arr.add(a);
        arr.add(b);
        arr.add(c);
        displayInteger(arr);
        int diagonalDifference = diagonalDifference(arr);
        System.out.println(diagonalDifference);

    }


    static int diagonalDifference(List <List <Integer>> arr) {
        int leftDiagSum = 0;
        int rightDiagSum = 0;
        int size = arr.size();

        for(int i = 0; i < size; i++){
            leftDiagSum += arr.get(i).get(i);
            rightDiagSum += arr.get(i).get(size - (i + 1));
        }
        return Math.abs(leftDiagSum - rightDiagSum);
    }


    static void displayInteger(List <List <Integer>> arrayList) {
        for(List <Integer> integerList : arrayList) {
            for(Integer integer : integerList) {
                if (integer.toString().length() == 1) {
                    System.out.print("   ");
                }
                if (integer.toString().length() == 2){
                    System.out.print("  ");
                }
                if (integer.toString().length() == 3){
                    System.out.print(" ");
                }
                System.out.print(integer);
            }
            System.out.println("");
        }
        System.out.println("..................");
    }

}
