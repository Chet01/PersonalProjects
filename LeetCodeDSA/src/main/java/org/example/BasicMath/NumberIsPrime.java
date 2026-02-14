package org.example.BasicMath;

public class NumberIsPrime {
    public static void main(String[] args){
        int number = 5;
        System.out.println("Is the given number is Prime : "+isPrime(number));
        System.out.println(isPalindrome(4554));
    }

    private static boolean isPalindrome(int number) {
        String actual = String.valueOf(number);
        String expected = "";
        char[] chars = actual.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            expected+=chars[i];
        }
        if(expected.equalsIgnoreCase(actual)) return true;
        return false;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
