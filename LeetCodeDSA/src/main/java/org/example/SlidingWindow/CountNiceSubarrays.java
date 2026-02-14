package org.example.SlidingWindow;

import java.util.HashMap;

public class CountNiceSubarrays {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);   // base case

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            // Convert odd/even
            sum += (num % 2);

            // Check if a valid subarray exists
            count += map.getOrDefault(sum - k, 0);

            // Store prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);
    }
}

