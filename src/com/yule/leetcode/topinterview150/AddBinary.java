package com.yule.leetcode.topinterview150;

public class AddBinary {
    public String addBinary(String a, String b) {
        int idx=0;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(idx<a.length() && idx<b.length()){
            idx++;
            int sum=a.charAt(a.length()-idx)-'0'+b.charAt(b.length()-idx)-'0'+carry;
            carry=sum/2;
            sb.insert(0,sum%2);
        }
        while(idx<a.length()){
            idx++;
            int sum=a.charAt(a.length()-idx)-'0'+carry;
            carry=sum/2;
            sb.insert(0,sum%2);
        }
        while(idx<b.length()){
            idx++;
            int sum=b.charAt(b.length()-idx)-'0'+carry;
            carry=sum/2;
            sb.insert(0,sum%2);
        }
        if(carry>0){
            sb.insert(0, carry);
        }
        return sb.toString();
    }
}
