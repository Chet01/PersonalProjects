package org.example.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (right - left + 1 == k) {
                int max = nums[left];
                for (int i = left; i <= right; i++) {
                    max = Math.max(max, nums[i]);
                }
                list.add(max);
                left++;
            }
        }
        int[] arr = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(list);
    }
}


// TIME LIMIT EXCEEDED IN LEET CODE - find optimal solution by DIFFERENT DATA STRUCTURE

