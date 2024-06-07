package com.yule.leetcode.topinterview150;

/**
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 *
 */
public class RemoveDuplicatesfromSortedArray1 {
    public int removeDuplicates(int[] nums) {
        int lastIdx=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[lastIdx]!=nums[i]){
                if(lastIdx+1<i){
                    nums[lastIdx+1]=nums[i];
                }
                lastIdx++;
            }
        }
        return lastIdx+1;
    }
}
