package org.example.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroesToEndOFTheArray {
    public static void main(String[] args){
        int[] array = {0,1,0,3,12,0,4,5,0,0,11};
        int n = array.length;
        int zerosCount = 0;
        int[] finalOutput = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(array[i]==0){
                zerosCount++;
            }
            else{
                list.add(array[i]);
            }
        }
        for(int i=0;i<zerosCount;i++){
            list.add(0);
        }
        System.out.println("--------USING BRUIT FORCE----------");
        System.out.println(list);

        System.out.println("--------USING TWO POINTERS---------");
        
        System.out.println(Arrays.toString(moveUsingPointers(array)));
    }

    private static int[] moveUsingPointers(int[] array) {
        int left=0;
        for (int right = 0; right < array.length; right++) {
            if (array[right] != 0) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
            }
        }
        return array;
    }
}
