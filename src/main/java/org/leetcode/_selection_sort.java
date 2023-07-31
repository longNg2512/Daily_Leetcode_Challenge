package org.leetcode;

import java.util.Arrays;

public class _selection_sort {
    public void selectionSort(int[] nums) {
        int numsLength = nums.length;
        for (int i = 0; i < numsLength; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numsLength; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}
