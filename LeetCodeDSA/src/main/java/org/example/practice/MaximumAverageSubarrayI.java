package org.example.practice;

import java.util.HashSet;
import java.util.Set;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double num = 0;
        int left = 0;
        double sum = 0;
        double currentSum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            if (right - left + 1 == k) {
                currentSum = Math.max(currentSum, sum);
                sum = sum - nums[left];
                left++;
            }
        }
        System.out.println(currentSum / k);
    }
}