package com.yule.leetcode.topinterview150;

import java.nio.charset.StandardCharsets;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        byte[] sb = s.getBytes(StandardCharsets.US_ASCII);
        byte[] tb = t.getBytes(StandardCharsets.US_ASCII);

        if(sb.length>tb.length){
            return false;
        }
        int tStart = 0;
        for (int i = 0; i < sb.length; i++) {
            if(tStart==tb.length){
                return false;
            }
            for (int j = tStart; j < tb.length; j++) {
                if (sb[i] == tb[j]) {
                    tStart = j + 1;
                    break;
                }
                if (j == tb.length - 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
