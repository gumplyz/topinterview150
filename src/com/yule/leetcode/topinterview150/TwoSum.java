package com.yule.leetcode.topinterview150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> numToIdx = new HashMap<>(nums.length);
        Set<Integer> sortedNums = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numToIdx.containsKey(nums[i])) {
                numToIdx.get(nums[i]).add(i);
            } else {
                List<Integer> tmpList = new ArrayList<>();
                tmpList.add(i);
                numToIdx.put(nums[i], tmpList);
            }
            sortedNums.add(nums[i]);
        }
        List<Integer> sortedList = Arrays.asList(sortedNums.toArray(new Integer[sortedNums.size()]));

        for (int i = 0; i < sortedList.size(); i++) {
            int part1 = sortedList.get(i);
            int toFind = target - sortedList.get(i);
            int idx = Collections.binarySearch(sortedList, toFind);
            if (idx >= 0) {
                if (part1 == toFind) {
                    if (numToIdx.get(part1).size() == 2) {
                        return new int[]{numToIdx.get(part1).get(0), numToIdx.get(part1).get(1)};
                    }
                } else {
                    return new int[]{numToIdx.get(part1).get(0), numToIdx.get(toFind).get(0)};
                }
            }
        }
        return new int[]{0, 0};
    }
}
