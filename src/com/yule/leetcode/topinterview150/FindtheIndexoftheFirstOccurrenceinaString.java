package com.yule.leetcode.topinterview150;

import java.nio.charset.StandardCharsets;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {
        byte[] bHaystack = haystack.getBytes(StandardCharsets.US_ASCII);
        byte[] bNeedle = needle.getBytes(StandardCharsets.US_ASCII);

        if (bNeedle.length > bHaystack.length) {
            return -1;
        }
        int j = 0;
        while (j <= (bHaystack.length - bNeedle.length)) {
            for (int i = 0; i < bNeedle.length; i++) {
                if (bNeedle[i] != bHaystack[j + i]) {
                    j ++;
                    break;
                }
                if (i == bNeedle.length - 1) {
                    return j;
                }
            }
        }
        return -1;

    }
}
