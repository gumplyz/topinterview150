package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FindtheIndexoftheFirstOccurrenceinaStringTest {

    @Test
    public void testStrStr1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        int expected=0;
        FindtheIndexoftheFirstOccurrenceinaString f = new FindtheIndexoftheFirstOccurrenceinaString();
        assertEquals(f.strStr(haystack, needle), expected);
    }

    @Test
    public void testStrStr2() {
        String haystack = "leetcode";
        String needle = "leeto";
        int expected=-1;
        FindtheIndexoftheFirstOccurrenceinaString f = new FindtheIndexoftheFirstOccurrenceinaString();
        assertEquals(f.strStr(haystack, needle), expected);
    }

    @Test
    public void testStrStr3() {
        String haystack = "hello";
        String needle = "ll";
        int expected=2;
        FindtheIndexoftheFirstOccurrenceinaString f = new FindtheIndexoftheFirstOccurrenceinaString();
        assertEquals(f.strStr(haystack, needle), expected);
    }

    @Test
    public void testStrStr4() {
        String haystack = "a";
        String needle = "a";
        int expected=0;
        FindtheIndexoftheFirstOccurrenceinaString f = new FindtheIndexoftheFirstOccurrenceinaString();
        assertEquals(f.strStr(haystack, needle), expected);
    }

    @Test
    public void testStrStr5() {
        String haystack = "mississippi";
        String needle = "issip";
        int expected=4;
        FindtheIndexoftheFirstOccurrenceinaString f = new FindtheIndexoftheFirstOccurrenceinaString();
        assertEquals(f.strStr(haystack, needle), expected);
    }
}