package org.example.SlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args){
        String s="ADOBECODEBANC";
        char[] array = s.toCharArray();
        String t="ABC";
        int left=0;
        HashMap<String,Integer> map = new HashMap<>();
        int windowSize = 0;
        boolean value = false;

        for(int right=0;right<array.length;right++){
            while (t.charAt(right)==s.charAt(right)) {
                value=true;
                windowSize++;
                right++;
            }


            windowSize = Math.min(windowSize,right-left+1);
        }
    }
}
