package com.company;

public class StairCase {

    public static void main(String[] args) {

        stairCase1(5);
        stairCase2(5);

    }

    private static void stairCase2(int n) {
        int star = 1, space = n-1;
        while(n > 0){
            for(int i = 0; i < space; i++){
                System.out.print(" ");
            }
            for(int i = 0; i < star; i++){
                System.out.print("#");
            }
            star = star + 1;
            space = space - 1;
            --n;
            System.out.println("");
        }
    }

    private static void stairCase1(int n) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < n; i++)
            builder.append(" ");

        int j = 0;
        for(int i = 1; i <= n; i++) {
            builder.replace(builder.length() - i,
                            builder.length() - j, "#");
            System.out.println(builder);
            j++;
        }

    }
}
