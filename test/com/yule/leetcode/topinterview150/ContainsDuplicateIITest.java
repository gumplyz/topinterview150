package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContainsDuplicateIITest {

    @Test
    public void testContainsNearbyDuplicate1() {
        int[] nums = {1,2,3,1};
        int k = 3;
        ContainsDuplicateII c=new ContainsDuplicateII();
        assertTrue(c.containsNearbyDuplicate(nums, k));
    }

    @Test
    public void testContainsNearbyDuplicate2() {
        int[] nums = {1,0,1,1};
        int k = 1;
        ContainsDuplicateII c=new ContainsDuplicateII();
        assertTrue(c.containsNearbyDuplicate(nums, k));
    }

    @Test
    public void testContainsNearbyDuplicate3() {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        ContainsDuplicateII c=new ContainsDuplicateII();
        assertFalse(c.containsNearbyDuplicate(nums, k));
    }
}