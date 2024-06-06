package com.yule.leetcode.topinterview150;

/**
 * 27. Remove Element
 * <a href="https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int lastIdx = nums.length - 1;
        for (int i = lastIdx; i >= 0; i--) {
            if (nums[i] == val) {
                if (i == lastIdx) {
                    nums[i] = -1;
                    lastIdx--;
                } else if (i < lastIdx) {
                    nums[i] = nums[lastIdx];
                    nums[lastIdx] = -1;
                    lastIdx--;
                }

            }
        }
        return lastIdx+1;

    }
}
