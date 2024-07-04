package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void testIsValid1() {
        String s = "()";
        ValidParentheses vp=new ValidParentheses();
        assertTrue(vp.isValid(s));
    }

    @Test
    public void testIsValid2() {
        String s = "()[]{}";
        ValidParentheses vp=new ValidParentheses();
        assertTrue(vp.isValid(s));
    }

    @Test
    public void testIsValid3() {
        String s = "(]";
        ValidParentheses vp=new ValidParentheses();
        assertFalse(vp.isValid(s));
    }
}