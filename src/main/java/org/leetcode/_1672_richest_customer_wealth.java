package org.leetcode;

public class _1672_richest_customer_wealth {
    public int maximumWealth(int[][] accounts) {
        int totalCustomer = accounts.length;
        int totalBank = accounts[0].length;
        int max = 0;

        for (int i = 0; i < totalCustomer; i++) {
            int totalMoney = 0;
            for (int j = 0; j < totalBank; j++) {
                totalMoney += accounts[i][j];
            }

            if (totalMoney > max) {
                max = totalMoney;
            }
        }
        return max;
    }
}
