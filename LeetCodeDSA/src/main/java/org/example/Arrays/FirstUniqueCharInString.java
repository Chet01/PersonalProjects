package org.example.Arrays;

import java.util.*;

public class FirstUniqueCharInString {
    public static void main(String[] args){
        String s = "aabb";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int index = 0;
        int result = -1;
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println(index);
                result=index;
                break;
            }
            index++;
        }
        System.out.println(result);
        int[] arr = new int[]{1,5,3,4,13,15,6};
        System.out.println(firstRepeated(arr));


    }

    public static int firstRepeated(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // find first repeated element
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > 1) {
                return i + 1; // 1-based index
            }
        }
        return -1;
    }

}
