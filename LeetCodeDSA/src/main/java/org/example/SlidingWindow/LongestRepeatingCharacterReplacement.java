package org.example.SlidingWindow;

import java.util.*;

//public class LongestRepeatingCharacterReplacement {
//    public static void main(String[] args) {
////        BAABAABBBAAA
//        String s = "ABCDE";
//        int k = 1;
//        int charCount = 0;
//        int left = 0;
//        int maxLength=0;
//        int right;
//        for(right = 0;right<s.length();right++) {
//            if(s.charAt(right)=='B'){
//                charCount++;
//            }
//            while (charCount > k) {
//                if (s.charAt(left) == 'B') {
//                    charCount--;
//                }
//                left++;
//            }
//
//            maxLength = Math.max(maxLength,right-left+1);
//        }
//        System.out.println(maxLength);
//
//    }
//}

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {

        String s = "ABCDE";
        int k = 1;

        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            int idx = s.charAt(right) - 'A';
            freq[idx]++;
            System.out.println(Arrays.toString(freq));

            maxFreq = Math.max(maxFreq, freq[idx]);

            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }
}

//LongestRepeatingCharacterReplacement - analyse the problem


