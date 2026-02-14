package org.example.SlidingWindow;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MaximumSumOfDisctictSubArraysWithLengthK {
    public static void main(String[] args){
        int[] nums = {1,5,4,2,9};
        int k = 3;
        int maxSum = maxSumOfNonDistinctElementsWithK(nums,k);
        System.out.println(maxSum);
        int[] nums1 = {1,5,4,2,9,9,9};
        int maxSum1 = maxSumOfDistinctElementsWithK(nums1,k);
        System.out.println(maxSum1);
    }

    private static int maxSumOfDistinctElementsWithK(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int maxSum = 0;
        Set<Integer> set = new HashSet<>();

        for (int right = 0; right < nums.length; right++) {

            // If duplicate found, shrink window
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            set.add(nums[right]);
            sum += nums[right];

            // Window size == k
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);

                // Slide window
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }


    private static int maxSumOfNonDistinctElementsWithK(int[] nums,int k) {
        int left=0;
        int sum=0;
        int maxSum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(right-left+1==k){
                maxSum = Math.max(maxSum,sum);
                sum-=nums[left];
                left++;
            }
        }
        return maxSum;
    }
}

