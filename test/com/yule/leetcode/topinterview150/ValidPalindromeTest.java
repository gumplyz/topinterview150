package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ValidPalindromeTest {

    @Test
    public void testIsPalindrome1() {
        String s = "A man, a plan, a canal: Panama";
        boolean expected = true;
        ValidPalindrome v = new ValidPalindrome();
        assertEquals(v.isPalindrome(s), expected);
    }

    @Test
    public void testIsPalindrome2() {
        String s = "race a car";
        boolean expected = false;
        ValidPalindrome v = new ValidPalindrome();
        assertEquals(v.isPalindrome(s), expected);
    }


    @Test
    public void testIsPalindrome3() {
        String s = " ";
        boolean expected = true;
        ValidPalindrome v = new ValidPalindrome();
        assertEquals(v.isPalindrome(s), expected);
    }

    @Test
    public void testIsPalindrome4() {
        String s = "0P";
        boolean expected = false;
        ValidPalindrome v = new ValidPalindrome();
        assertEquals(v.isPalindrome(s), expected);
    }

    @Test
    public void testIsPalindrome5() {
        String s = "a.";
        boolean expected = true;
        ValidPalindrome v = new ValidPalindrome();
        assertEquals(v.isPalindrome(s), expected);
    }


    @Test
    public void testIsPalindrome6() {
        String s = ".,";
        boolean expected = true;
        ValidPalindrome v = new ValidPalindrome();
        assertEquals(v.isPalindrome(s), expected);
    }

}