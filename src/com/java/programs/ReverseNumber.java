package com.java.programs;

public class ReverseNumber {
    public static void main(String args[]) {
       /* int n;
        System.out.println("Enter an integer to reverse");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        System.out.println("Reverse of the number is " + revreseNumber(n));*/

        System.out.println("Reverse of the number is " + revreseNumber(1234));

    }

    private static int revreseNumber(int n) {
        int reverse = 0;
        while(n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }

        return reverse;
    }
}
