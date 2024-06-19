package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IsomorphicStringsTest {

    @Test
    public void testIsIsomorphic1() {
        String s = "egg", t = "add";
        boolean expected = true;
        IsomorphicStrings isomorphicStrings=new IsomorphicStrings();
        assertEquals(isomorphicStrings.isIsomorphic(s, t), expected);
    }

    @Test
    public void testIsIsomorphic2() {
        String s = "foo", t = "bar";
        boolean expected = false;
        IsomorphicStrings isomorphicStrings=new IsomorphicStrings();
        assertEquals(isomorphicStrings.isIsomorphic(s, t), expected);
    }

    @Test
    public void testIsIsomorphic3() {
        String s = "paper", t = "title";
        boolean expected = true;
        IsomorphicStrings isomorphicStrings=new IsomorphicStrings();
        assertEquals(isomorphicStrings.isIsomorphic(s, t), expected);
    }

    @Test
    public void testIsIsomorphic4() {
        String s = "badc", t = "baba";
        boolean expected = false;
        IsomorphicStrings isomorphicStrings=new IsomorphicStrings();
        assertEquals(isomorphicStrings.isIsomorphic(s, t), expected);
    }
}