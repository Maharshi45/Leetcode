package com.maharshi;

public class MySqrt {

    public static int mySqrt(int x) {

        if (x == 0 || x == 1)
            return x;

        long left = 1;
        long right = x;

        while (left < right) {
            long mid = (left + right) / 2;
            if (mid > x / mid)
                right = mid;
            else
                left = mid + 1;
        }
        return (int) left - 1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2));
    }

}
