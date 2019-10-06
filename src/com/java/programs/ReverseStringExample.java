package com.java.programs;

import java.util.Scanner;

public class ReverseStringExample {
    public static void main(String args[])  {
        String original="";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse");
        original = in.nextLine();

        String reverse = reverseString(original);

        System.out.println("Reverse of the string: " + reverse);
    }



    private static String reverseString(String original) {
        char[] s = original.toCharArray();
        int n = s.length;
        int halfLength = n / 2;
        for (int i=0; i<halfLength; i++)
        {
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
        return new String(s);
    }

   /* private static String reverseString(String original) {
        String reverse = "";
        int length = original.length();
        for (int i = length - 1 ; i >= 0 ; i--) {
            reverse = reverse + original.charAt(i);
        }
        return reverse;
    }*/
}