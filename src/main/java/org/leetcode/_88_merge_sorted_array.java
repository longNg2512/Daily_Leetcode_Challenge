package org.leetcode;

public class _88_merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2) {
            chenPhanTuVaoMang(ai, nums1, m);
            m++;
        }
    }

    private void chenPhanTuVaoMang(int ai, int[] nums1, int m) {
        boolean timDuocK = false;

// Xác định index k của mảng nums1 để thực hiện chèn ai vào
        for (int k = 0; k < m; k++) {
            if (nums1[k] > ai) {
                timDuocK = true;

// Thực hiện dịch từ cuối mảng nums1 sang phải bắt đầu từ vị trí k
                for (int i = m - 1; i >= k; i--) {
                    nums1[i + 1] = nums1[i];
                }
                nums1[k] = ai;
                break;
            }
        }
// Nếu không tìm được phần tử k, chèn ai vào cuối mảng nums1
        if (!timDuocK) {
            nums1[m] = ai;
        }
    }
}
