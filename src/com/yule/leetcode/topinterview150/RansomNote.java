package com.yule.leetcode.topinterview150;

import java.nio.charset.StandardCharsets;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        byte[] bRansonNote=ransomNote.getBytes(StandardCharsets.US_ASCII);
        byte[] bMagazine=magazine.getBytes(StandardCharsets.US_ASCII);

        if(bRansonNote.length>bMagazine.length){
            return false;
        }

        int[] charCount=new int[26];

        for (int i = 0; i < bMagazine.length; i++) {
            charCount[bMagazine[i]-97]++;
        }

        for (int i = 0; i < bRansonNote.length; i++) {
            int c=bRansonNote[i]-97;
            if(charCount[c]==0){
                return false;
            }
            charCount[c]--;
        }
        return true;

    }
}
