package com.maharshi;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        for (; index >= 0; index--) {
            if (digits[index] == 9) {
                digits[index] = 0;
            } else {
                digits[index]++;
                break;
            }
        }
        if (index == -1) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] array = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        array = plusOne(array);
        for (int n : array)
            System.out.println(n);
    }

}
