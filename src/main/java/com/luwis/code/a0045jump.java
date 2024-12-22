package com.luwis.code;

public class a0045jump {


    public int jump(int[] nums) {
        int n = nums.length;
        int end = 0;
        int maxPosition = 0;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                count++;
            }
        }
        return count;
    }

    public int jump2(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (dp[j] >= i) {
                    dp[j + 1] = Math.max(dp[j + 1], i + nums[i]);
                }
            }
        }
        for (int i = 0; i < n + 1; i++) {
            System.out.println(dp[i]);
        }
        for (int i = 0; i < n + 1; i++) {
            if (dp[i] >= n - 1) return i;
        }
        return -1;
    }


}
