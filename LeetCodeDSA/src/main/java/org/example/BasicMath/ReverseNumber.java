package org.example.BasicMath;

import java.nio.charset.Charset;
import java.util.stream.Stream;

public class ReverseNumber {
    public static void main(String[] args){
        int number = 478938492;
        String value = String.valueOf(number);
        char[] chars = value.toCharArray();
        String result = "";
        for(int i=chars.length-1;i>=0;i--){
            result+=chars[i];
        }
        System.out.println(result);
    }

}
