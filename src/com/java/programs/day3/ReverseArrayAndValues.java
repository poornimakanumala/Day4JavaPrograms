package com.java.programs.day3;

import java.util.Arrays;

public class ReverseArrayAndValues {
    public static void main(String[] args) {
        int[] array = {5, 12, 123, 1231, 1248};
        int[] resultArray = reverseArrayAndValues(array);
        System.out.println("Reverse Array with Reversed values: " + Arrays.toString(resultArray));
        //output : Reverse Array with Reversed values: [8421, 1321, 321, 21, 5]
    }

    private static int[] reverseArrayAndValues(int[] array){
        for(int i=0; i<=array.length/2; i++){
            int temp = array[i];
            array[i] = reverseNumber(array[array.length -i -1]);
            array[array.length -i -1] = reverseNumber(temp);
        }
        return array;
    }

    private static int reverseNumber(int n) {
        int reverse = 0;
        while(n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }

        return reverse;
    }
}
