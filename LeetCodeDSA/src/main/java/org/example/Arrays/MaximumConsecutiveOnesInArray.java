package org.example.Arrays;

public class MaximumConsecutiveOnesInArray {
    public static void main(String[] args){
        int[] array = {1, 0, 1, 1, 0};
        int left=0;
        int maxOnes = 0;
        for(int right=0;right<array.length;right++){
            while(array[left]!=array[right]){
                left++;
            }
            maxOnes = Math.max(maxOnes,right-left+1);
        }
        System.out.println(maxOnes);

    }

}
