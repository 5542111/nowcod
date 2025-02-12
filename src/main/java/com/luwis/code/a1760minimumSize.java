package com.luwis.code;

import java.util.Arrays;

public class a1760minimumSize {

    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = Arrays.stream(nums).max().getAsInt();
        int ans = 0;

        while (left <= right) {
            int y = left + (right - left) / 2;
            long ops = 0;
            for (int num : nums) {
                ops += (num - 1) / y;
            }
            if (ops <= maxOperations) {
                ans = y;
                right = y - 1;
            } else {
                left = y + 1;
            }
        }
        return ans;
    }


}
