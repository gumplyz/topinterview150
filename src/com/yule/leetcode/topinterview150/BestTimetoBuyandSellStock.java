package com.yule.leetcode.topinterview150;


import java.util.ArrayList;
import java.util.List;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        List<Integer> low=new ArrayList(prices.length);
        List<Integer> high=new ArrayList(prices.length);
        for (int i = 0; i < prices.length-1; i++) {
            //high -> low
            if(prices[i]>prices[i+1]){
                high.add(i);

            }else if(prices[i]<prices[i+1]){ // low -> high
                low.add(i);
            }
        }
        int r=0;
        for (Integer lowIdx:low) {
            for (Integer highIdx:high) {
                if(lowIdx<highIdx){
                    r=Math.max(r, prices[highIdx]-prices[lowIdx]);
                }
            }
        }
        return r;
    }
}
