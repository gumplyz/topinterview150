package com.yule.leetcode.topinterview150;

import java.nio.charset.StandardCharsets;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        byte[] bs = s.getBytes(StandardCharsets.US_ASCII);
        byte[] ts = t.getBytes(StandardCharsets.US_ASCII);

        if (bs.length != ts.length) {
            return false;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < bs.length; i++) {
            if (map1[bs[i]] == 0) {
                map1[bs[i]] = ts[i]+1;
            } else {
                if (map1[bs[i]] != (ts[i]+1)) {
                    return false;
                }
            }

            if (map2[ts[i] ] == 0) {
                map2[ts[i] ] = bs[i] +1;
            } else {
                if (map2[ts[i]] != (bs[i] +1)) {
                    return false;
                }
            }
        }

        return true;
    }
}
