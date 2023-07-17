package org.leetcode;

public class Main {
    public static void main(String[] args) {
        _88_merge_sorted_array mergeSortedArray = new _88_merge_sorted_array();
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        mergeSortedArray.merge(nums1, 3, nums2, 3);
        System.out.println("Done!");
    }
}