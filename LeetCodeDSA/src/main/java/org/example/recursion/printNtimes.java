package org.example.recursion;

public class printNtimes {

    public static void main(String[] args){
        int count = 0;
        printNTimes("Hello Chethan",count);
        int start=1;
        int number=10;
        print1toN(start,number);
    }

    private static void print1toN(int start,int number) {
        if(start>number){
            return;
        }
        System.out.println(start);
        start++;
        print1toN(start,number);
    }

    private static void printNTimes(String name,int count) {
        if(count==10){
            return;
        }
        System.out.println(name);
        count++;
        printNTimes(name,count);
    }
}
