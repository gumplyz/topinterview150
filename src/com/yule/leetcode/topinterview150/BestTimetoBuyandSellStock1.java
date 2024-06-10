package com.yule.leetcode.topinterview150;


public class BestTimetoBuyandSellStock1 {
    public int maxProfit(int[] prices) {
        int r=0;
        int low=Integer.MAX_VALUE;
        for (int i = 1; i < prices.length; i++) {
            //high -> low
            if(prices[i-1]>prices[i]){
                r=findMax(r, low, prices[i-1]);

            }else if(prices[i-1]<prices[i]){ // low -> high
                low=Math.min(low, prices[i-1]);
                if(i==(prices.length-1)){
                    r=findMax(r, low, prices[i]);
                }
            }
        }
        return r;
    }

    private int findMax(int r, int low, int high){
        if(low==Integer.MAX_VALUE){
            return r;
        }
        return Math.max(r, high-low);
    }
}
