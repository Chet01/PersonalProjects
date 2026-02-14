package org.example.recursion;

public class FactorialOfNnumber {
    public static void main(String[] args){
        int number = 13284;
        long fact=1;
        long result = factOfN(number,fact);
        System.out.println(result);
    }

    private static long factOfN(int number,long fact) {
        if(number==0){
            return fact;
        }
        fact = fact * number;
        number--;
        return factOfN(number,fact);
    }

}
