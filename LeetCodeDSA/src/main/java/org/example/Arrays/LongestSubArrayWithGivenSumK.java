package org.example.Arrays;

public class LongestSubArrayWithGivenSumK {
    public static void main(String[] args){
        int[] array = {10, 5, 2,8, 9};
        int left=0;
        int sum=0;
        int k=17;
        int maxSubArraySize = 0;
        for(int right=0;right<array.length;right++){
            sum=sum+array[right];
            if(sum==k){
                maxSubArraySize = Math.max(maxSubArraySize,right-left+1);
                sum=sum-array[left];
                left++;
            }
        }
        System.out.println(maxSubArraySize);
    }
}
