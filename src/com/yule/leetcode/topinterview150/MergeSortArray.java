package com.yule.leetcode.topinterview150;

/**
 *
 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class MergeSortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int previousIdx=0;
        for (int i = 0; i < n; i++) {
            previousIdx=insertInto1(nums2[i], previousIdx, nums1, m+i);
        }

    }
    
    private int insertInto1(int k, int startIdx, int[] nums1, int m){
        int insertIdx=m;
        for (int i = startIdx; i < m; i++) {
            if(k<nums1[i]){
                insertIdx=i;
                break;
            }
        }
        for (int i = m; i > insertIdx; i--) {
            nums1[i]=nums1[i-1];
        }
        nums1[insertIdx]=k;
        return insertIdx+1;
    }
}
