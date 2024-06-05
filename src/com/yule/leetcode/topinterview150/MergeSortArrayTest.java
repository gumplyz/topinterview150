package com.yule.leetcode.topinterview150;

import static org.testng.Assert.*;

public class MergeSortArrayTest {

    @org.testng.annotations.Test
    public void testMerge1() {
        int[] nums1 =new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        int[] expected=new int[]{1,2,2,3,5,6};
        MergeSortArray ms = new MergeSortArray();
        ms.merge(nums1, m, nums2, n);
        assertEquals(nums1, expected);
    }

    @org.testng.annotations.Test
    public void testMerge2() {
        int[] nums1 =new int[]{1};
        int m = 1;
        int[] nums2 = new int[]{};
        int n = 0;
        int[] expected=new int[]{1};
        MergeSortArray ms = new MergeSortArray();
        ms.merge(nums1, m, nums2, n);
        assertEquals(nums1, expected);
    }

    @org.testng.annotations.Test
    public void testMerge3() {
        int[] nums1 =new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;
        int[] expected=new int[]{1};
        MergeSortArray ms = new MergeSortArray();
        ms.merge(nums1, m, nums2, n);
        assertEquals(nums1, expected);
    }
}