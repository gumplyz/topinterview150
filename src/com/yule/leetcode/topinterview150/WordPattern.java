package com.yule.leetcode.topinterview150;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        byte[] bPattern=pattern.getBytes(StandardCharsets.US_ASCII);
        String[] tokens=s.split(" ");
        if(bPattern.length!=tokens.length){
            return false;
        }

        String[] map=new String[26];
        Map<String, Integer> tokenMap=new HashMap<>();
        for (int i = 0; i < bPattern.length; i++) {
            if(null==map[bPattern[i]-97]){
                map[bPattern[i]-97]=tokens[i];
            }else{
                if(!map[bPattern[i]-97].equals(tokens[i])){
                    return false;
                }
            }
            if(!tokenMap.keySet().contains(tokens[i])){
                tokenMap.put(tokens[i], (int) bPattern[i]);
            }else{
                if(tokenMap.get(tokens[i])!=(int) bPattern[i]){
                        return false;
                }
            }

        }
        return true;
    }
}
