package com.yule.leetcode.topinterview150;

import java.nio.charset.StandardCharsets;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.length()==1){
            return true;
        }
        byte[] b = s.getBytes(StandardCharsets.US_ASCII);
        int i = 0;
        int j = b.length - 1;
        while (i <= j) {
            if (65 <= b[i] && b[i] <= 90) {
                b[i] += 32;
            }
            if (65 <= b[j] && b[j] <= 90) {
                b[j] += 32;
            }

            if (!((48 <= b[i] && b[i] <= 57) || (97 <= b[i] && b[i] <= 122))) {
                i++;
                continue;
            }
            if (!((48 <= b[j] && b[j] <= 57) || (97 <= b[j] && b[j] <= 122))) {
                j--;
                continue;
            }
            if (b[i] == b[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
