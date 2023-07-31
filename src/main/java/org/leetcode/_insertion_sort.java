package org.leetcode;

import java.util.Arrays;

public class _insertion_sort {
    public void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
            System.out.println(Arrays.toString(nums));
        }
    }
}
