package com.maharshi;

public class TODONumArray {

    int[] nums;

    public TODONumArray(int[] nums) {
        this.nums = nums;
    }

    public void update(int index, int val) {
        nums[index] = val;
    }

    public int sumRange(int left, int right) {

        if (this.nums.length == 2)
            return nums[0] + nums[1];

        int sum = 0;
        int mid = (left + right) / 2;
        int mid2 = mid * 2;
        for (int i = left; i <= mid; i++) {
            if (i == mid2 - i) {
                sum += nums[i];
            } else {
                sum += nums[i] + nums[mid2 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{9, -8};

        TODONumArray obj = new TODONumArray(nums);

        System.out.println(obj.sumRange(0, 1));

    }

}
