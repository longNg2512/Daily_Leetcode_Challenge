package org.leetcode;

public class _27_remove_element {
    public int removeElement(int[] nums, int val) {
        int numsLength = nums.length;
        for (int i = 0; i < numsLength; ) {
            if (nums[i] == val) {
                for (int j = i; j < (numsLength - 1); j++) {
                    nums[j] = nums[j + 1];
                }
                numsLength--;
            } else {
                i++;
            }
        }
        return numsLength;
    }
}
