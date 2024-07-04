package com.yule.leetcode.topinterview150;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() <= 1) {
            return false;
        }

        Stack<Character> f = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                f.push(c);
            } else {
                if (f.empty()) {
                    return false;
                }
                char t = f.pop();
                if (c == ')' && t != '(') {
                    return false;
                }
                if (c == ']' && t != '[') {
                    return false;
                }
                if (c == '}' && t != '{') {
                    return false;
                }
            }
        }
        return f.empty();
    }
}
