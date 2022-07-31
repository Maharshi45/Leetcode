package com.maharshi;

public class Divide {

	public static int divide(int dividend, int divisor) {

		if (dividend == 0)
			return 0;

		int result = 0;

		if (divisor < 0 && dividend < 0) {
			while (dividend <= divisor) {
				dividend -= divisor;
				result++;
			}
			if (result == Integer.MIN_VALUE)
				result = 2147483647;
		} else if ((divisor < 0 && dividend > 0) || (dividend < 0 && divisor > 0)) {
			if (divisor > 0)
				divisor = -divisor;
			else
				dividend = -dividend;
			while (dividend <= divisor) {
				dividend -= divisor;
				result++;
			}
			result = -result;
		} else {
			while (dividend >= divisor) {
				dividend -= divisor;
				result++;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		System.out.println(divide(-2147483648, 1));

	}

}
