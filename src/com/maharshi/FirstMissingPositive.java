package com.maharshi;

import java.util.Set;
import java.util.TreeSet;

public class FirstMissingPositive {

    public static int firstMissingPositive(int[] nums) {

        Set<Integer> numSet = new TreeSet<>();
        for (int num : nums) {
            if (num > 0)
                numSet.add(num);
        }
        Integer[] numsArr = new Integer[numSet.size()];
        numsArr = numSet.toArray(numsArr);
        int i = 1;
        for (int j = 0; j < numsArr.length; j++, i++) {
            if (i != numsArr[j])
                return i;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, -1, 1};
        System.out.println(firstMissingPositive(nums));
    }

}
