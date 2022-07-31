package com.maharshi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public static List<List<Integer>> fourSum(int[] nums, int target) {

		if (nums.length < 4)
			return new ArrayList<List<Integer>>();

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 3; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				for (int j = i + 1; j < nums.length - 2; j++) {
					if (j == i + 1 || nums[j] != nums[j - 1]) {
						int left = j + 1;
						int right = nums.length - 1;
						while (left < right) {
							int sum = nums[i] + nums[left] + nums[right] + nums[j];

							if (sum == target) {
								List<Integer> list2 = new ArrayList<Integer>();
								list2.add(nums[i]);
								list2.add(nums[j]);
								list2.add(nums[left]);
								list2.add(nums[right]);
								result.add(list2);
								while (left < right && nums[left] == nums[left + 1])
									left++;
								while (left < right && nums[right] == nums[right - 1])
									right--;
								left++;
								right--;
							} else if (sum < target) {
								while (left < right && nums[left] == nums[left + 1])
									left++;
								while (left < right && nums[right] == nums[right - 1])
									right--;
								left++;
							} else {
								while (left < right && nums[left] == nums[left + 1])
									left++;
								while (left < right && nums[right] == nums[right - 1])
									right--;
								right--;
							}
						}
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 2, 2, 2, 2 };
		List<List<Integer>> list = fourSum(nums, 8);
		for (List<Integer> intList : list) {
			System.out.println(Arrays.toString(intList.toArray()));
		}
	}
}
