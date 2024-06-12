package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RomantoIntegerTest {

    @Test
    public void testRomanToInt1() {
        String s = "III";
        int expected=3;
        RomantoInteger r=new RomantoInteger();
        assertEquals(r.romanToInt(s), expected);
    }

    @Test
    public void testRomanToInt2() {
        String s = "LVIII";
        int expected=58;
        RomantoInteger r=new RomantoInteger();
        assertEquals(r.romanToInt(s), expected);
    }

    @Test
    public void testRomanToInt3() {
        String s = "MCMXCIV";
        int expected=1994;
        RomantoInteger r=new RomantoInteger();
        assertEquals(r.romanToInt(s), expected);
    }

    @Test
    public void testRomanToInt4() {
        String s = "D";
        int expected=500;
        RomantoInteger r=new RomantoInteger();
        assertEquals(r.romanToInt(s), expected);
    }
}