package com.yule.leetcode.topinterview150;

import java.nio.charset.StandardCharsets;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {

        byte[] b = s.getBytes(StandardCharsets.US_ASCII);
        if (b.length == 1) {
            return 1;
        }
        int len = 0;
        for (int i = b.length-1; i >=0 ; i--) {
            if(b[i] != 32){
                len++;
            }else{
                break;
            }
        }

        return len;
    }
}
