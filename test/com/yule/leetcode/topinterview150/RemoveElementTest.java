package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class RemoveElementTest {

    @Test
    public void testRemoveElement1() {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        int k=2;
        int[] expected_nums = new int[] {2,2};

        RemoveElement r=new RemoveElement();
        int actual=r.removeElement(nums, val);
        assertEquals(actual, k);
        assertContent(nums, expected_nums);


    }

    @Test
    public void testRemoveElement2() {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int k=5;
        int[] expected_nums = new int[] {0,1,4,0,3};

        RemoveElement r=new RemoveElement();
        int actual=r.removeElement(nums, val);
        assertEquals(actual, k);
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