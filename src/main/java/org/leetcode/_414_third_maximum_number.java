package org.leetcode;

public class _414_third_maximum_number {
    public int thirdMax(int[] nums) {
        long[] maxArr = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for (int val :
                nums) {
            insertArr(maxArr, val);
        }
        if (maxArr[2] == Long.MIN_VALUE) {
            return (int) maxArr[0];
        }
        return (int) maxArr[2];
    }

    private void insertArr(long[] maxArr, int val) {
        int i = 0;
        while (i < maxArr.length) {
            if (maxArr[i] == val) {
                return;
            } else if (val > maxArr[i]) {
                break;
            } else {
                i++;
            }
        }
        if (i < maxArr.length) {
            for (int j = maxArr.length - 2; j >= i; j--) {
                maxArr[j + 1] = maxArr[j];
            }
            maxArr[i] = val;
        }
    }
}
