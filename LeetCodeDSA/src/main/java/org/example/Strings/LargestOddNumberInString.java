package org.example.Strings;

public class LargestOddNumberInString {
    public static void main(String[] args){
        String number = "4206";
        String result = "";
        for(int i=number.length()-1;i>=0;i--){
            int digit = number.charAt(i) - '0';
            if(digit%2==1) {
                result = number.substring(0, i+1);
                break;
            }
        }
        System.out.println(result);
    }

}
