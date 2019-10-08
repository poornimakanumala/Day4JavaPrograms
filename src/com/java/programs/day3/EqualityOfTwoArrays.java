package com.java.programs.day3;
/*1. In Iterative method, first we check length of two given arrays. If the length of both arrays is same, then we compare corresponding
pairs of elements of both the arrays. If all corresponding pairs of elements are equal, then given arrays will be considered
as equal. This method will be time consuming if the arrays have lots of elements. This method is not recommended to check
the equality of two arrays if the arrays are big in size. But without using inbuilt functions this is the way.
2. in-built Arrays.equals(s1, s2)
3. in-built Arrays.deepEquals(s1, s2) to work with multi dimensional arrays
 */
public class EqualityOfTwoArrays {
    public static void main(String[] args) {
            int[] arrayOne = {2, 5, 1, 7, 4};
            int[] arrayTwo = {2, 5, 1, 7, 4};

        boolean equalOrNot = isArraysEqualOrNot(arrayOne, arrayTwo);

            if (equalOrNot) {
                System.out.println("Two Arrays Are Equal");
            } else {
                System.out.println("Two Arrays Are Not equal");
            }
        }

    private static boolean isArraysEqualOrNot(int[] arrayOne, int[] arrayTwo) {
        boolean equalOrNot = true;

        if(arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if(arrayOne[i] != arrayTwo[i]) {
                    equalOrNot = false;
                }
            }
        } else {
            equalOrNot = false;
        }
        return equalOrNot;
    }
}
