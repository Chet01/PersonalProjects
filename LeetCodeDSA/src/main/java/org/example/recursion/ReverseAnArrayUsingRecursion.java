package org.example.recursion;


import java.util.Arrays;

public class ReverseAnArrayUsingRecursion {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(array)));
        reverse(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    private static int[] reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        return array;
    }

    private static void reverse(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        reverse(array, start + 1, end - 1);
    }

}
