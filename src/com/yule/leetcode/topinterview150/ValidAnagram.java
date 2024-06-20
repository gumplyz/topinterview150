package com.yule.leetcode.topinterview150;

import java.nio.charset.StandardCharsets;
import java.util.TreeMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        byte[] bs = s.getBytes(StandardCharsets.US_ASCII);
        byte[] bt = t.getBytes(StandardCharsets.US_ASCII);

        if (bs.length != bt.length) {
            return false;
        }

        int[] scount = new int[26];
        for (int i = 0; i < bs.length; i++) {
            scount[bs[i] - 97]++;
        }
        //count - distinct char count
        TreeMap<Integer, Integer> sMap = new TreeMap<>();
        for (int i = 0; i < scount.length; i++) {
            if (scount[i] > 0) {
                sMap.put(scount[i], (sMap.getOrDefault(scount[i], 1).intValue() + 1));
            }
        }


        int[] tcount = new int[26];
        for (int i = 0; i < bt.length; i++) {
            tcount[bt[i] - 97]++;
        }
        //count - distinct char count
        TreeMap<Integer, Integer> tMap = new TreeMap<>();
        for (int i = 0; i < tcount.length; i++) {
            if (tcount[i] > 0) {
                tMap.put(tcount[i], (tMap.getOrDefault(tcount[i], 1).intValue() + 1));
            }
        }

        if(sMap.keySet().size()!=tMap.keySet().size()){
            return false;
        }


    }
}
