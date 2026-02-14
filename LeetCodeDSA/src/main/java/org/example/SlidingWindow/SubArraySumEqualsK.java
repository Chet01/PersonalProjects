package org.example.SlidingWindow;

import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args){
        int[] nums = {1,1,1};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // prefix sum 0 at index -1

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // store only first occurrence
            map.putIfAbsent(sum, i);
        }

        System.out.println(maxLen); // 2
    }
}

//revisit this
