package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TwoSumTest {

    @Test
    public void testTwoSum1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        TwoSum twoSum = new TwoSum();
        assertEquals(twoSum.twoSum(nums, target), expected);
    }

    @Test
    public void testTwoSum2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        TwoSum twoSum = new TwoSum();
        assertEquals(twoSum.twoSum(nums, target), expected);
    }

    @Test
    public void testTwoSum3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        TwoSum twoSum = new TwoSum();
        assertEquals(twoSum.twoSum(nums, target), expected);
    }
}