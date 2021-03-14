package com.company;

public class LongArraySum {
    public static void main(String[] args) {
        long[] array = {16_356_424_324L, 22_624_727_247L, 427_247_263_735L, 55_375_467_372L, 6_277_732_735_723L};
        System.out.println(aVeryBigSum(array));
    }

    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for(int index = 0; index < ar.length; index++) {
            sum += ar[index];
        }
        return sum;
    }
}
