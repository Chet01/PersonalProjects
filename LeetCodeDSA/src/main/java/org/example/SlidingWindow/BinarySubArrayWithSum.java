package org.example.SlidingWindow;

public class BinarySubArrayWithSum {
    public static void main(String[] args){
        int[] array = {1, 0, 1, 0, 1};
        int goal = 2;
        int maxSubArrays = 0;
        int sum = 0;
        int left=0;
        for(int right=0;right<array.length;right++){
            sum = sum + array[right];
            while(sum>goal){
                sum-=array[right];
                left++;
            }
            maxSubArrays = Math.max(maxSubArrays,right-left+1);
        }

        System.out.println(maxSubArrays);
    }
}
