package com.yule.leetcode.topinterview150;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, target, 0, nums.length-1);
    }

    private int searchInsert(int[] nums, int target, int startIdx, int endIdx){
        while(startIdx<endIdx){
            int mid=(startIdx+endIdx)/2;
            if(target==nums[mid]){
                return mid;
            } else if(target<nums[mid]){
                endIdx=mid;
            } else {
                startIdx=mid+1;
            }
        }
        if(target>nums[startIdx]){
            return startIdx+1;
        }
        return startIdx;
    }

}
