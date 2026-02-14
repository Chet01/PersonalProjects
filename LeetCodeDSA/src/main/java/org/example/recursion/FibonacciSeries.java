package org.example.recursion;

import java.util.ArrayList;

import static javax.swing.text.html.HTML.Attribute.N;

public class FibonacciSeries {
    public static void main(String[] args){
        int N = 5;
//        ArrayList<Integer> list = new ArrayList<>();
//        fibonacciSeries(N);
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    private static void fibonacciSeries(int n) {
        int start=0;
        int second = start+1;
        while(start<n){
            System.out.print(start+ " ");
            int sum = start+second;
            start=second;
            second=sum;
        }

    }
}
