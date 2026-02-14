package org.example.SlidingWindow;

public class MaxVowelsInSubStringOfGivenLength {
    public static void main(String[] args){
        String s = "abciiidef";
        char[] ch = s.toCharArray();
        int runningCount = 0;
        int k=3;
        int left = 0;
        int count = 0;
        for(int right=0;right<ch.length;right++){
            if(ch[right]=='a'||ch[right]=='e'||ch[right]=='i'||ch[right]=='o'||ch[right]=='u'){
                count++;
            }
            while(right-left+1==k){
                runningCount = Math.max(runningCount,count);
                if (ch[left] == 'a' || ch[left] == 'e' || ch[left] == 'i'
                        || ch[left] == 'o' || ch[left] == 'u') {
                    count--;
                }
                left++;
            }

        }
        System.out.println(runningCount);
    }
}
