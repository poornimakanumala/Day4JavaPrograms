package com.java.programs;

import java.util.Scanner;

public class ReverseDoubleExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a double to reverse");
        double doubleValue = in.nextDouble();
        String reversed = x(doubleValue);
        System.out.println("The Reverse of input is " + reversed);
    }

    private static String x(double doubleValue) {
        return new StringBuffer(String.valueOf(doubleValue)).reverse().toString();
    }
}
