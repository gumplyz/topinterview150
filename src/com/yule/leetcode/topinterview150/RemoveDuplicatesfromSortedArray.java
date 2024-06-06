package com.yule.leetcode.topinterview150;

/**
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 *
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int endIdx = nums.length - 1;
        int startIdx = endIdx;

        while (startIdx > 0) {
            startIdx = findUniqueue(nums, startIdx);
            //find duplicate index
            int dupStart = startIdx - 1;
            int dupEnd = dupStart;
            while (dupStart >= 0 && nums[dupStart] == nums[startIdx]) {
                dupStart--;
            }
            for (int i = 0; i < endIdx - startIdx + 1; i++) {
                nums[dupStart + i + 1] = nums[startIdx + i];
            }
            int len = endIdx - startIdx + 1;
            startIdx = dupStart + 1;
            endIdx = startIdx + len - 1;

        }
        return endIdx - startIdx + 1;
    }

    private int findUniqueue(int[] nums, int startIdx) {

        for (int i = startIdx; i > 0; i--) {
            if (nums[i] == nums[i - 1]) {
                return i;
            }
        }
        return 0;
    }
}
