package com.maharshi;

import java.util.Arrays;

public class MinMoves2 {

	public static int minMoves2(int[] nums) {
		Arrays.sort(nums);
		int pivot;
		if (nums.length % 2 == 0)
			pivot = nums[((nums.length / 2) + (nums.length / 2 - 1)) / 2];
		else
			pivot = nums[nums.length / 2];
		int moves = 0;
		for (int num : nums)
			moves += Math.abs(num - pivot);
		return moves;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 10, 2, 9 };
		System.out.println(minMoves2(nums));
	}

}
