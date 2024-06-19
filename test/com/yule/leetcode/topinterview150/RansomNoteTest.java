package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RansomNoteTest {

    @Test
    public void testCanConstruct1() {
        String ransomNote = "a", magazine = "b";
        boolean expected=false;
        RansomNote r=new RansomNote();
        assertEquals(r.canConstruct(ransomNote, magazine), expected);
    }

    @Test
    public void testCanConstruct2() {
        String ransomNote = "aa", magazine = "ab";
        boolean expected=false;
        RansomNote r=new RansomNote();
        assertEquals(r.canConstruct(ransomNote, magazine), expected);
    }

    @Test
    public void testCanConstruct3() {
        String ransomNote = "aa", magazine = "aab";
        boolean expected=true;
        RansomNote r=new RansomNote();
        assertEquals(r.canConstruct(ransomNote, magazine), expected);
    }
}