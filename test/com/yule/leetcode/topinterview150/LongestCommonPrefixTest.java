package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix1() {
        String[] strs = new String[]{"flower","flow","flight"};
        String expected="fl";
        LongestCommonPrefix l=new LongestCommonPrefix();
        assertEquals(l.longestCommonPrefix(strs), expected);
    }

    @Test
    public void testLongestCommonPrefix2() {
        String[] strs = new String[]{"dog","racecar","car"};
        String expected="";
        LongestCommonPrefix l=new LongestCommonPrefix();
        assertEquals(l.longestCommonPrefix(strs), expected);
    }

    @Test
    public void testLongestCommonPrefix3() {
        String[] strs = new String[]{"a"};
        String expected="a";
        LongestCommonPrefix l=new LongestCommonPrefix();
        assertEquals(l.longestCommonPrefix(strs), expected);
    }
}