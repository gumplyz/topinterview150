package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LengthofLastWordTest {

    @Test
    public void testLengthOfLastWord1() {
        String s = "Hello World";
        int k=5;

        LengthofLastWord l=new LengthofLastWord();
        int actual=l.lengthOfLastWord(s);
        assertEquals(actual, k);
    }

    @Test
    public void testLengthOfLastWord2() {

        String s =  "   fly me   to   the moon  ";
        int k=4;

        LengthofLastWord l=new LengthofLastWord();
        int actual=l.lengthOfLastWord(s);
        assertEquals(actual, k);
    }

    @Test
    public void testLengthOfLastWord3() {

        String s =  "luffy is still joyboy";
        int k=6;

        LengthofLastWord l=new LengthofLastWord();
        int actual=l.lengthOfLastWord(s);
        assertEquals(actual, k);
    }

    @Test
    public void testLengthOfLastWord4() {

        String s =  "Today is a nice day";
        int k=3;

        LengthofLastWord l=new LengthofLastWord();
        int actual=l.lengthOfLastWord(s);
        assertEquals(actual, k);
    }
}