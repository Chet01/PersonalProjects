package org.example.Arrays;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args){
        boolean status = isAnagram("anagram","nagaram");
        System.out.println(status);
    }
    public static boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(ch1.length==ch2.length){
            return Arrays.equals(ch1, ch2);
        }
        else{
            return false;
        }
    }
}
