package org.example.TwoPointers;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberofKSumPairs {
    public static void main(String[] args){
        int[] nums = {2,2,2,3,1,1,4,1};
        int k=4;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = k - num;
            if (map.getOrDefault(complement, 0) > 0) {
                count++;
                map.put(complement, map.get(complement) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        System.out.println(count);
    }
}
