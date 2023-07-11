package org.leetcode;

public class _1295_find_numbers_with_even_number_of_digits {
    private int calcLengthElem(int elem) {
        int count = 0;
        int result = elem;
        while (result != 0) {
            result = elem / 10;
            elem = result;
            count++;
        }
        return count;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int elem : nums) {
            if (calcLengthElem(elem) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
