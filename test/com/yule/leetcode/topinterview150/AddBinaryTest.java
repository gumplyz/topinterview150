package com.yule.leetcode.topinterview150;

import static org.testng.Assert.*;

public class AddBinaryTest {

        @org.testng.annotations.Test
        public void testAddBinary1() {
            String a = "11";
            String b = "1";
            String k="100";

            AddBinary s=new AddBinary();
            String actual=s.addBinary(a, b);
            assertEquals(actual, k);
        }

        @org.testng.annotations.Test
        public void testAddBinary2() {
            String a = "1010";
            String b = "1011";
            String k="10101";

            AddBinary s=new AddBinary();
            String actual=s.addBinary(a, b);
            assertEquals(actual, k);
        }

        @org.testng.annotations.Test
        public void testAddBinary3() {
            String a = "0";
            String b = "0";
            String k="0";

            AddBinary s=new AddBinary();
            String actual=s.addBinary(a, b);
            assertEquals(actual, k);
        }

}