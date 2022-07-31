package com.maharshi;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumUnits {

	public static int maximumUnits(int[][] boxTypes, int truckSize) {

		Arrays.sort(boxTypes, Comparator.comparing(a -> -a[1]));
		System.out.println(Arrays.deepToString(boxTypes));

		int result = 0;

		int i = 0;
		int tempSize = 0;
		while (i < boxTypes.length && tempSize != truckSize) {
			if ((tempSize + boxTypes[i][0]) > truckSize) {
				result += (truckSize - tempSize) * boxTypes[i][1];
				break;
			} else {
				result += boxTypes[i][0] * boxTypes[i][1];
				tempSize += boxTypes[i][0];
				i++;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int[][] boxTypes = new int[][] { { 5, 10 }, { 2, 5 }, { 4, 7 }, { 3, 9 } };

		System.out.println(maximumUnits(boxTypes, 10));

	}

}
