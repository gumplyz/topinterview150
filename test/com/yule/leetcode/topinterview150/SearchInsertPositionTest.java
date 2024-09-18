package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchInsertPositionTest {

    @Test
    public void testSearchInsert1() {
        int[] nums = {1,3,5,6};
        int target = 5;
        int k=2;

        SearchInsertPosition s=new SearchInsertPosition();
        int actual=s.searchInsert(nums, target);
        assertEquals(actual, k);
    }

    @Test
    public void testSearchInsert2() {
        int[] nums = {1,3,5,6};
        int target = 2;
        int k=1;

        SearchInsertPosition s=new SearchInsertPosition();
        int actual=s.searchInsert(nums, target);
        assertEquals(actual, k);
    }

    @Test
    public void testSearchInsert3() {
        int[] nums = {1,3,5,6};
        int target = 7;
        int k=4;

        SearchInsertPosition s=new SearchInsertPosition();
        int actual=s.searchInsert(nums, target);
        assertEquals(actual, k);
    }
}