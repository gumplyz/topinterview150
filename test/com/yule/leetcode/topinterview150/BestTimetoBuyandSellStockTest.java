package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BestTimetoBuyandSellStockTest {

    @Test
    public void testMaxProfit1() {
        int[] prices = new int[]{7,1,5,3,6,4};
        int expected=5;
        BestTimetoBuyandSellStock b=new BestTimetoBuyandSellStock();
        assertEquals(b.maxProfit(prices), expected);
    }

    @Test
    public void testMaxProfit2() {
        int[] prices = new int[]{7,6,4,3,1};
        int expected=0;
        BestTimetoBuyandSellStock b=new BestTimetoBuyandSellStock();
        assertEquals(b.maxProfit(prices), expected);
    }
}