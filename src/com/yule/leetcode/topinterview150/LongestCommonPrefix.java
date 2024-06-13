package com.yule.leetcode.topinterview150;

import java.nio.charset.StandardCharsets;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        int rc = 0;
        int minLen = 200;
        byte[][] bytes = new byte[strs.length][200];
        for (int i = 0; i < strs.length; i++) {
            bytes[i] = strs[i].getBytes(StandardCharsets.UTF_8);
            minLen = Math.min(minLen, bytes[i].length);
        }
        byte[] r = new byte[minLen];
        for (int j = 0; j < minLen; j++) {
            boolean match = false;
            for (int i = 1; i < strs.length; i++) {
                if (bytes[i][j] != bytes[0][j]) {
                    break;
                }
                if (i == strs.length - 1) {
                    match = true;
                    r[rc] = bytes[0][j];
                    rc++;

                }

            }
            if (!match) {
                break;
            }
        }

        return new String(r, 0, rc, StandardCharsets.US_ASCII);
    }

}
