package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HappyNumberTest {

    @Test
    public void testIsHappy1() {
        int n = 19;
        HappyNumber hn=new HappyNumber();
        assertTrue(hn.isHappy(n));
    }

    @Test
    public void testIsHappy2() {
        int n = 2;
        HappyNumber hn=new HappyNumber();
        assertFalse(hn.isHappy(n));
    }
}