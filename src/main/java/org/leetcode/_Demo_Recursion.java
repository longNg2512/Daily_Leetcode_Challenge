package org.leetcode;

public class _Demo_Recursion {
    public int GiaiThua(int n) {
        // Bai toan co so
        if (n == 0) {
            return 1;
        }
        // Cong thuc quy nap
        return n * GiaiThua(n - 1);
    }

    public int Fibo(int n) {
        // Bai toan co so
        if (n <= 2) {
            return 1;
        }
        return Fibo(n - 1) + Fibo(n - 2);
    }
}
