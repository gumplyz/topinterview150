package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IsSubsequenceTest {

    @Test
    public void testIsSubsequence1() {
        String s = "abc", t = "ahbgdc";
        boolean expected=true;
        IsSubsequence sub=new IsSubsequence();
        assertEquals(sub.isSubsequence(s, t), expected);
    }

    @Test
    public void testIsSubsequence2() {
        String s = "axc", t = "ahbgdc";
        boolean expected=false;
        IsSubsequence sub=new IsSubsequence();
        assertEquals(sub.isSubsequence(s, t), expected);
    }

    @Test
    public void testIsSubsequence3() {
        String s = "abc", t = "";
        boolean expected=false;
        IsSubsequence sub=new IsSubsequence();
        assertEquals(sub.isSubsequence(s, t), expected);
    }

    @Test
    public void testIsSubsequence4() {
        String s = "acb", t = "ahbgdc";
        boolean expected=false;
        IsSubsequence sub=new IsSubsequence();
        assertEquals(sub.isSubsequence(s, t), expected);
    }
}