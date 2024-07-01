package com.yule.leetcode.topinterview150;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> loop = new HashSet<>();
        int candidate = 0;
        int next = n;
        do {
            do {
                int q=next/10;
                int one = next-q*10;
                candidate += one * one;
                next = q;
            } while (next > 0);

            if (loop.contains(candidate)) {
                break;
            } else {
                loop.add(candidate);
            }
            next = candidate;
            candidate = 0;
        } while (true);
        return candidate == 1;
    }
}
