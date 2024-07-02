package com.yule.leetcode.topinterview150;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numToIdx=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(numToIdx.containsKey(nums[i])){
                Integer lastIdx=numToIdx.get(nums[i]);
                if((i-lastIdx)<=k){
                    return true;
                }else{
                    numToIdx.put(nums[i], i);
                }
            }else{
                numToIdx.put(nums[i], i);
            }
        }
        return false;
    }
}
