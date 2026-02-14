package org.example.SlidingWindow;

public class LongestSubArrayWithSumLessThanK {
    public static void main(String[] args){
        int[] array = {2,5,1,7,10};
        int k=14;
        int left = 0;
        int sum = 0;
        int windowSize = 0;
        for(int right=0;right<array.length;right++){
           sum+=array[right];
           while(sum>k){
              sum-=array[left];
              left++;
           }
           windowSize = Math.max(windowSize, right - left + 1);
        }
        System.out.println(windowSize);
    }
}

//In order to return number of sub arrays we have to do :
//Number of subarrays where sum <= k
//Number of subarrays where (sum <= k-1)
