package org.example.Hashing;

import java.util.*;

public class DuplicatesInArray {
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            if(!set.contains(num)){
                set.add(num);
            }
            else{
                list.add(num);
            }
        }
        System.out.println(list);
    }
}
