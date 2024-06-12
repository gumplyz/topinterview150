package com.yule.leetcode.topinterview150;

import java.nio.charset.StandardCharsets;

public class RomantoInteger1 {

    public int romanToInt(String s) {
        byte[] b=s.getBytes(StandardCharsets.UTF_8);
        if(b.length==1){
            return getIntOf(b[0]);
        }
        int sum=0;

        int i=0;
        while(i<s.length()){
            int c = b[i];
            if (c == 73 && i < (b.length - 1)) {
                int n = b[i + 1];
                if (n == 86) {
                    sum += 4;
                    i=i+2;
                } else if (n == 88) {
                    sum += 9;
                    i=i+2;
                } else {
                    sum+=getIntOf(c);
                    i=i+1;
                }
            } else if (c == 88 && i < (b.length - 1)) {
                int n = b[i + 1];
                if (n == 76) {
                    sum += 40;
                    i=i+2;
                } else if (n == 67) {
                    sum += 90;
                    i=i+2;
                }else {
                    sum+=getIntOf(c);
                    i=i+1;
                }
            }else if (c == 67 && i < (b.length - 1)) {
                int n = b[i + 1];
                if (n == 68) {
                    sum += 400;
                    i=i+2;
                }else if (n == 77) {
                    sum += 900;i=i+2;
                }else {
                    sum+=getIntOf(c);
                    i=i+1;
                }
            } else {
                sum+=getIntOf(c);
                i=i+1;
            }

        }

        return sum;
    }
    private int getIntOf(int c){

        switch (c){
            case 73:return 1;
            case 86:return 5;
            case 88:return 10;
            case 76:return 50;
            case 67:return 100;
            case 68:return 500;
            case 77:return 1000;

        }
        return 0;
    }
}
