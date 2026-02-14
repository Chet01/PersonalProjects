package org.example.demo;

import java.util.Arrays;


public class Demo {
    public static void main(String[] args) {
        // You are testing a function that is supposed to find the first missing positive integer in an unsorted list of numbers
        // Input: [3, 4, -1, 1] -- okta
        int[] nums = {2, 3, -1, 1, 7, 8, 0};
        //selection sort
        //first find minimum index
        for(int i=0;i<nums.length;i++){
            int minimum = findMinimum(nums,i);
            swapNumberss(minimum,i,nums);
        }
        System.out.println(Arrays.toString(nums));

        System.out.println(findFirstMissingPositiveNumber(nums));
    }

    public static int findFirstMissingPositiveNumber(int[] nums) {
        // Arrays.sort(nums);
        int start=1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==start) {
                start++;
            }
        }
        return start;
    }

    private static void swapNumberss(int minimum, int i,int[] nums) {
        int temp = 0;
        temp=nums[i];
        nums[i]=nums[minimum];
        nums[minimum]=temp;
    }

    private static int findMinimum(int[] nums, int i) {
        int minimum = i;
        for(int j=i;j<nums.length;j++){
            if(nums[j]<nums[minimum]){
                minimum=j;
            }
        }
        return minimum;
    }
}



