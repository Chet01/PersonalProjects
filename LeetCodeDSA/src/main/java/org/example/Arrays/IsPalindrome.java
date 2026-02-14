package org.example.Arrays;

public class IsPalindrome {
    public static void main(String[] args){
        String str = "c1 O$d@eeD o1c";
        String result = str.replaceAll("[^a-zA-Z0-9]", "");
        char[] ch = result.toCharArray();
        System.out.println(result);
        int start = 0;
        int end = result.length()-1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        System.out.println("is palindrome : "+ch==new String(ch));

    }
}
