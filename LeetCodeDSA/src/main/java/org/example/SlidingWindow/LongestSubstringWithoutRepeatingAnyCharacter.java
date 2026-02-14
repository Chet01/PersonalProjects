package org.example.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingAnyCharacter {
    public static void main(String[] args){
        String s = "abcdbabac";
        int result = LongestSubstringWithoutRepeat(s);
        System.out.println(result);
    }

    private static int LongestSubstringWithoutRepeat(String s) {
        String result = "";
        Set<Character> set = new HashSet<>();
        char[] array = s.toCharArray();
        int left=0;
        int maxLength=0;
        for(int right=0;right<array.length;right++){
            // when window is not valid remove element and shrink
            while(set.contains(array[right])){
                set.remove(array[left]);
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
