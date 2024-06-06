package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class RemoveDuplicatesfromSortedArrayTest {

    @Test
    public void testRemoveDuplicates1() {
        int[] nums = new int[]{1,1,2};
        int expected_k=2;
        int[] expected_nums=new int[]{1,2};

        RemoveDuplicatesfromSortedArray r=new RemoveDuplicatesfromSortedArray();
        int k=r.removeDuplicates(nums);
        assertEquals(k, expected_k);
        assertContent(nums, expected_nums);
    }

    @Test
    public void testRemoveDuplicates2() {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int expected_k=5;
        int[] expected_nums=new int[]{0,1,2,3,4};

        RemoveDuplicatesfromSortedArray r=new RemoveDuplicatesfromSortedArray();
        int k=r.removeDuplicates(nums);
        assertEquals(k, expected_k);
        assertContent(nums, expected_nums);
    }

    @Test
    public void testRemoveDuplicates3() {
        int[] nums = new int[]{1,2};
        int expected_k=2;
        int[] expected_nums=new int[]{1,2};

        RemoveDuplicatesfromSortedArray r=new RemoveDuplicatesfromSortedArray();
        int k=r.removeDuplicates(nums);
        assertEquals(k, expected_k);
        assertContent(nums, expected_nums);
    }

    private boolean assertContent(int[] actual, int[] expected){
        Arrays.sort(expected);
        for (int i = 0; i < expected.length; i++) {
            if(-1==Arrays.binarySearch(expected, actual[i])){
                return false;
            }
        }
        return true;
    }
}