package com.java.programs.day3;

import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {
        int[] array = {2,4,1,5,6,8,7,3};
        System.out.println("Median of Array is : " + median(array));
    }


    public static double median(int[] array) {
        if(array.length == 0){
            throw new IllegalArgumentException("Cannot compute median on empty array");
        }
        Arrays.sort(array);
        double median;
        if (array.length % 2 == 0) {
            median = ((double) array[array.length / 2] + (double) array[array.length / 2 - 1]) / 2;
        } else {
            median = (double) array[array.length / 2];
        }
        return median;
    }
}