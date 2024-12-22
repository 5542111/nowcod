package com.luwis.code;

import java.util.*;

public class a0253meetingRooms {


    public int meetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));

        List<Integer> list = new ArrayList<>();
        list.add(intervals[0][1]);
        int res = 1;
        for (int i = 1; i < intervals.length; i++) {
            boolean isNeed = true;
            for (int j = 0; j < list.size(); j++) {
                if (intervals[i][0] >= list.get(j)) {
                    list.set(j, intervals[i][1]);
                    isNeed = false;
                    break;
                }
            }
            if (isNeed) {
                res++;
                list.add(intervals[i][1]);
            }

        }
        return res;
    }

    public int meetingRooms2(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));

        for (int[] interval : intervals) {
            if (!pq.isEmpty() && pq.peek()[1] <= interval[0]) {
                pq.poll();
            }
            pq.offer(interval);
        }
        return pq.size();

    }
}
