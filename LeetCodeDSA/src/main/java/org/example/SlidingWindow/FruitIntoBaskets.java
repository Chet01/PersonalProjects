package org.example.SlidingWindow;

import java.util.HashMap;

public class FruitIntoBaskets {
    public static void main(String[] args){

        int[] array = {1, 2, 3, 2, 2};
        int k = 2;

        int left = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < array.length; right++) {

            // ✅ Correct increment
            map.put(array[right], map.getOrDefault(array[right], 0) + 1);

            // ✅ Correct shrinking logic
            while (map.size() > k) {
                map.put(array[left], map.get(array[left]) - 1);

                if (map.get(array[left]) == 0) {
                    map.remove(array[left]);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }
}
