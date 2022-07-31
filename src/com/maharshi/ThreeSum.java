package com.maharshi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {

		if (nums.length < 3) {
			return new ArrayList<List<Integer>>();
		}

		Arrays.sort(nums);

		List<List<Integer>> list1 = new ArrayList<List<Integer>>();

		for (int i = 0; i < nums.length - 2; i++) {

			if (i == 0 || nums[i] != nums[i - 1]) {

				int left = i + 1;
				int right = nums.length - 1;

				while (left < right) {

					int sum = nums[i] + nums[left] + nums[right];

					if (sum == 0) {
						List<Integer> list2 = new ArrayList<Integer>();
						list2.add(nums[i]);
						list2.add(nums[left]);
						list2.add(nums[right]);
						list1.add(list2);
						while (left < right && nums[left] == nums[left + 1])
							left++;
						while (left < right && nums[right] == nums[right - 1])
							right--;
						left++;
						right--;
					} else if (sum < 0)
						left++;
					else
						right--;
				}
			}

		}
		return list1;
	}

	public static void main(String[] args) {

		int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };

		System.out.println(Arrays.toString(threeSum(nums).toArray()));

	}

}
