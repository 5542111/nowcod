package com.luwis.code;

import java.util.HashMap;
import java.util.Map;

public class a0594findLHS {


    public int findLHS(int[] nums) {
        int max = 0;
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int count = entry.getValue();
            if (hashMap.containsKey(entry.getKey() + 1)) {
                max = Math.max(max, count + hashMap.get(entry.getKey() + 1));
            }
        }
        return max;
    }
}
