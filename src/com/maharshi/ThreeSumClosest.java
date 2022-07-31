package com.maharshi;

import java.util.Arrays;

public class ThreeSumClosest {

	public static int threeSumClosest(int[] nums, int target) {

		int result = Integer.MAX_VALUE;
		int diff = Integer.MAX_VALUE;

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				int left = i + 1;
				int right = nums.length - 1;
				while (left < right) {
					int sum = nums[i] + nums[left] + nums[right];

					int tempDiff = sum - target;
					if (Math.abs(tempDiff) < diff) {
						diff = Math.abs(tempDiff);
						result = sum;
					}
					if (tempDiff < 0)
						left++;
					else
						right--;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int[] nums = new int[] { -1, 0, 1, 1, 55 };
		System.out.println(threeSumClosest(nums, 3));

	}

}
