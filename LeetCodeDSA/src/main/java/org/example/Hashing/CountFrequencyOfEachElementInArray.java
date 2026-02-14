package org.example.Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class CountFrequencyOfEachElementInArray {
    public static void main(String[] args){
        int[] array  = {10,5,10,15,10,5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }
            else{
                map.put(array[i],map.get(array[i]) + 1);
            }
        }

        for(int i:map.keySet()){
            System.out.println("Key is "+i+" and repeated "+map.get(i));
        }

        int mapSize = map.values().size();
        HashSet<Integer> set = new HashSet<>();
        for(int i:map.values()){
            set.add(i);
        }
        if(mapSize== set.size()){
            System.out.println("No duplicates");
        }
    }
}
