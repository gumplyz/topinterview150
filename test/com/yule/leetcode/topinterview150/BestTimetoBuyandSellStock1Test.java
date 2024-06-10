package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BestTimetoBuyandSellStock1Test {

    @Test
    public void testMaxProfit1() {
        int[] prices = new int[]{7,1,5,3,6,4};
        int expected=5;
        BestTimetoBuyandSellStock1 b=new BestTimetoBuyandSellStock1();
        assertEquals(b.maxProfit(prices), expected);
    }

    @Test
    public void testMaxProfit2() {
        int[] prices = new int[]{7,6,4,3,1};
        int expected=0;
        BestTimetoBuyandSellStock1 b=new BestTimetoBuyandSellStock1();
        assertEquals(b.maxProfit(prices), expected);
    }

    @Test
    public void testMaxProfit3() {
        int[] prices = new int[]{1,2};
        int expected=1;
        BestTimetoBuyandSellStock1 b=new BestTimetoBuyandSellStock1();
        assertEquals(b.maxProfit(prices), expected);
    }
}