package org.example.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatterns {
    public static void main(String[] args){
        String input = "abc123xyz456";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        String str = "Test@123#Java$2025!";
        String res = str.replaceAll("[A-Za-z0-9]","");
        System.out.println(res);

        String s1 = "OrderID-9988-Qty-45";
        Pattern pattern1 = Pattern.compile("\\d+");
        Matcher matcher1 = pattern.matcher(s1);

        while(matcher1.find()){
            System.out.println(matcher1.group());
        }

    }
}
