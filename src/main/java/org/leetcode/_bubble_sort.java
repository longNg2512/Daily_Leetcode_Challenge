package org.leetcode;

import java.util.Arrays;

public class _bubble_sort {
    public void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean swap = true;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = false;
                }
            }
            if (swap) {
                break;
            }
            System.out.println(Arrays.toString(nums));
        }

    }
}
