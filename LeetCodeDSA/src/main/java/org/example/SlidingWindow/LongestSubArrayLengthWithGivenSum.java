package org.example.SlidingWindow;

public class LongestSubArrayLengthWithGivenSum {
    public static void main(String[] args){
        int[] nums = {10, 5, 2, 7, 1, 9};
        int left = 0;
        int sum = 0;
        int maxLen = 0;
        int k=15;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > k) {
                sum -= nums[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        System.out.println(maxLen);

    }
}
