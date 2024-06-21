package com.yule.leetcode.topinterview150;

import java.nio.charset.StandardCharsets;


public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        byte[] bs = s.getBytes(StandardCharsets.US_ASCII);
        byte[] bt = t.getBytes(StandardCharsets.US_ASCII);

        if (bs.length != bt.length) {
            return false;
        }

        int[] scount = new int[26];
        int[] tcount = new int[26];
        for (int i = 0; i < bs.length; i++) {
            scount[bs[i] - 97]++;
            tcount[bt[i] - 97]++;
        }

        for (int i = 0; i < scount.length; i++) {
            if(scount[i]!=tcount[i]){
                return false;
            }
        }

        return true;
    }
}
