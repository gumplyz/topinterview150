package com.yule.leetcode.topinterview150;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class RomantoInteger {
    private static Set<Character> checheckChars=Set.of('I','X','C');
    private static Map<CombinedChars, Integer> checkCharsToInteger=Map.of(
            new CombinedChars('I','V'),4,
            new CombinedChars('I','X'),9,
            new CombinedChars('X','L'),40,
            new CombinedChars('X','C'),90,
            new CombinedChars('C','D'),400,
            new CombinedChars('C','M'), 900);
    private static Map<Character, Integer> romanToInteger = Map.of('I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        if(s.length()==1){
            return romanToInteger.get(s.charAt(0));
        }
        int sum=0;
        int i=0;
        while(i<s.length()){
            if(checheckChars.contains(s.charAt(i))&&i<(s.length()-1)){
                Integer temp=checkCharsToInteger.get(new CombinedChars(s.charAt(i), s.charAt(i+1)));
                if(temp!=null) {
                    sum += temp;
                    i=i+2;
                } else {
                    sum+=romanToInteger.get(s.charAt(i));
                    i=i+1;
                }
            } else {
                sum+=romanToInteger.get(s.charAt(i));
                i=i+1;
            }

        }
        return sum;

    }
    static class CombinedChars{
        private Character first;
        private Character second;

        public CombinedChars(Character first, Character second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CombinedChars that = (CombinedChars) o;
            return Objects.equals(first, that.first) && Objects.equals(second, that.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }
}
