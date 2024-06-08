package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MajorityElement1Test {

    @Test
    public void testMajorityElement1() {
        int[] nums = new int[]{3,2,3};
        int expected=3;
        MajorityElement1 m=new MajorityElement1();
        assertEquals(m.majorityElement(nums), expected);
    }

    @Test
    public void testMajorityElement2() {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        int expected=2;
        MajorityElement1 m=new MajorityElement1();
        assertEquals(m.majorityElement(nums), expected);
    }

    @Test
    public void testMajorityElement3() {
        int[] nums = new int[]{1};
        int expected=1;
        MajorityElement1 m=new MajorityElement1();
        assertEquals(m.majorityElement(nums), expected);
    }
}