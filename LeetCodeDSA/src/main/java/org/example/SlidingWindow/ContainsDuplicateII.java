package org.example.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 1};
        int k = 1;

        int left = 0;
        boolean value = false;

        Set<Integer> set = new HashSet<>();

        for (int right = 0; right < array.length; right++) {

            // if duplicate found within window
            if (set.contains(array[right])) {
                value = true;
                break;
            }

            set.add(array[right]);

            // keep window size <= k
            if (right - left >= k) {
                set.remove(array[left]);
                left++;
            }
        }

        System.out.println(value);
    }
}
