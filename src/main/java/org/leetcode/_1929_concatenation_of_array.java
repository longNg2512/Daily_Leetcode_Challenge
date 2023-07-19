package org.leetcode;

import java.util.Arrays;

public class _1929_concatenation_of_array {
    public int[] getConcatenation(int[] nums) {
        int numsLength = nums.length;
        int[] numsCopy = Arrays.copyOf(nums, numsLength * 2);
        for (int i = 0; i < numsLength; i++) {
            numsCopy[i + numsLength] = numsCopy[i];
        }
        return numsCopy;
    }
}
