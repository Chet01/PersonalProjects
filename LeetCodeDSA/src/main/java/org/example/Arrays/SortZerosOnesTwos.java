package org.example.Arrays;

import java.util.*;

public class SortZerosOnesTwos {
    public static void main(String[] args){
        int[] nums = {1, 0, 2, 1, 0, 1, 0, 2};
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
        }

        System.out.println(map);
        int[] array = new int[nums.length];
        int index = 0;

        // Fill 0s
        for (int i = 0; i < map.getOrDefault(0, 0); i++) {
            array[index++] = 0;
        }
        // Fill 1s
        for (int i = 0; i < map.getOrDefault(1, 0); i++) {
            array[index++] = 1;
        }
        // Fill 2s
        for (int i = 0; i < map.getOrDefault(2, 0); i++) {
            array[index++] = 2;
        }
        System.out.println(Arrays.toString(array));


    }
}
