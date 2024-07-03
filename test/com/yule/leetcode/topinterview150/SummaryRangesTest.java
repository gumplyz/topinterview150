package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class SummaryRangesTest {

    @Test
    public void testSummaryRanges1() {
        int[] nums = {0,1,2,4,5,7};
        List<String> expected=List.of("0->2","4->5","7");
        SummaryRanges sr=new SummaryRanges();
        assertTrue(compareList(expected, sr.summaryRanges(nums)));
    }

    @Test
    public void testSummaryRanges2() {
        int[] nums = {0,2,3,4,6,8,9};
        List<String> expected=List.of("0","2->4","6","8->9");
        SummaryRanges sr=new SummaryRanges();
        assertTrue(compareList(expected, sr.summaryRanges(nums)));
    }

    private boolean compareList(List<String> source, List<String> target){
        if(source.size()!=target.size()){
            return false;
        }

        for (int i = 0; i < source.size(); i++) {
            assertEquals(target.get(i), source.get(i));
        }
        return true;
    }
}