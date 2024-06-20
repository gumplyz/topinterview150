package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WordPatternTest {

    @Test
    public void testWordPattern1() {
        String pattern = "abba", s = "dog cat cat dog";
        boolean expected = true;
        WordPattern wp=new WordPattern();
        assertEquals(wp.wordPattern(pattern, s), expected);
    }


    @Test
    public void testWordPattern2() {
        String pattern = "abba", s = "dog cat cat fish";
        boolean expected = false;
        WordPattern wp=new WordPattern();
        assertEquals(wp.wordPattern(pattern, s), expected);
    }


    @Test
    public void testWordPattern3() {
        String pattern = "aaaa", s = "dog cat cat fish";
        boolean expected = false;
        WordPattern wp=new WordPattern();
        assertEquals(wp.wordPattern(pattern, s), expected);
    }

    @Test
    public void testWordPattern4() {
        String pattern = "abba", s = "dog dog dog dog";
        boolean expected = false;
        WordPattern wp=new WordPattern();
        assertEquals(wp.wordPattern(pattern, s), expected);
    }
}