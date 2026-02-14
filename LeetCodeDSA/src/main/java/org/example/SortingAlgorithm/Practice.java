package org.example.SortingAlgorithm;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args){
        int[] array = {3,45,20,1,10};
        for(int i=0;i<array.length-1;i++){
            int min = minNumber1(array,i,array.length-1);
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    private static int minNumber1(int[] array,int start,int end) {
        int minIndex = start;
        for(int i=start;i<end;i++){
            if(array[i]<array[minIndex]){
                minIndex=i;
            }
        }
        return minIndex;
    }
}
