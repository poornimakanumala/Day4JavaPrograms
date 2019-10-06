package com.java.programs;

import java.util.Scanner;

public class FactQuotientExample {
    public static void main(String[] args) {
        int m, n;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first integer between 1 and 15 (m) :");
        m = in.nextInt();

        System.out.println("Enter second integer between 1 and 15 and less than m value (n) :");
        n = in.nextInt();
        //1<N<M<15
        long factorialQuotientResult = factQuotient(m, n);

        System.out.println("Factorial Quotient Result : "+ factorialQuotientResult);
    }

    private static long factQuotient(int m, int n) {
        long mFactorial = factorialOfaNumber(m);
        long nFactorial = factorialOfaNumber(n);

        return mFactorial/nFactorial;
    }

    private static long factorialOfaNumber(int number) {
        long fact=1;
        for(int i=1; i<=number; i++){
            fact = fact*i;
        }
        return fact;
    }
}
