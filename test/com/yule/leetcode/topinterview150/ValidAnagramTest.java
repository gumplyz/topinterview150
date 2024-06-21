package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ValidAnagramTest {

    @Test
    public void testIsAnagram1() {
        String s = "anagram", t = "nagaram";
        boolean expected=true;
        ValidAnagram va=new ValidAnagram();
        assertEquals(va.isAnagram(s, t), expected);
    }

    @Test
    public void testIsAnagram2() {
        String s = "rat", t = "cat";
        boolean expected=false;
        ValidAnagram va=new ValidAnagram();
        assertEquals(va.isAnagram(s, t), expected);
    }
}