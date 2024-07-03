package com.yule.leetcode.topinterview150;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length==0){
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        int start = nums[0];
        int prev = nums[0];
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur = nums[i];
            if (cur == prev + 1) {
                prev = cur;
            } else {
                if (start != prev) {
                    result.add(String.format("%s->%s", start, prev));
                } else {
                    result.add(String.valueOf(start));
                }

                start = cur;
                prev = cur;
            }
        }
        if (start != prev) {
            result.add(String.format("%s->%s", start, prev));
        } else {
            result.add(String.valueOf(start));
        }
        return result;
    }
}
