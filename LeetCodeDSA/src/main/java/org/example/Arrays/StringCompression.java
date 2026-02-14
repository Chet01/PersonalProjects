package org.example.Arrays;

import java.util.HashMap;

public class StringCompression {
    public static void main(String[] args) {
        char[] ch = {'a','b','b','b','b','b','b','b','b','b','b','a','a'};
        String result = "";

        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                }
                else{
                    break;
                }
            }
            result += ch[i]+String.valueOf(count);
            i = i + count - 1;
        }
        System.out.println(result);
    }
}

