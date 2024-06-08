package com.yule.leetcode.topinterview150;

/**
 * https://leetcode.com/problems/majority-element/
 * https://leetcode.com/problems/majority-element/solutions/3015428/c-moore-s-voting-algorithm-explained-in-super-simple-fast-way/
 */
public class MajorityElement1 {
    public int majorityElement(int[] nums) {
        int ans=0;
        int cnt=0;

        for (int i = 0; i < nums.length; i++) {
            if(cnt==0){
                ans=nums[i];
            }
            if(nums[i]==ans){
                cnt++;
            }
            else{
                cnt--;
            }
        }

        return ans;
    }
}
