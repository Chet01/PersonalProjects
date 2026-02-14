package org.example.SortingAlgorithm;

import java.util.Arrays;

import static java.util.Collections.swap;

public class SelectionSort {
    public static void main(String[] args){
        int[] array  = {23,50,3,22,10};
        for(int i=0;i<array.length;i++){
//            get the minimum number first from the range i to n
            int min = minNumber(array,i,array.length);
            swapNumbers(i,min,array);
        }
        System.out.println(Arrays.toString(array));

    }

    static int minNumber(int[] array, int start, int end) {
        int minIndex = start;
        for(int i=start;i<end;i++){
            if(array[i]<array[minIndex]){
                minIndex=i;
            }
        }
        return minIndex;
    }

    private static void swapNumbers(int i, int min,int[] array) {
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }
}



//time complexity :

//         1+ 2 + .... (n-1)
//        (n-1) * (n-1+1)/2
//         n*n-n/2  ignore constant and less rank one time complexity is O(n*n)
