package org.example.BinarySearch;

import java.util.ArrayList;

public class FirstOrLastOccurenceInSortedArray {
    public static void main(String[] args){
        int[] array = {3, 4, 13, 13, 13, 20, 40};
        int target = 13;
        ArrayList<Integer> list = new ArrayList<>();

        for(int right=0;right<array.length-1;right++){
            if(array[right]==target){
                list.add(right);
            }
        }

        System.out.println("First index at : "+list.getFirst());
        System.out.println("Last index at : "+list.getLast());
        
        System.out.println(findFirstByBinarySearch(array,target));
        System.out.println(findLast(array,13));


    }

    private static int findFirstByBinarySearch(int[] array, int target) {
        int start=0;
        int end=array.length-1;
        int mid=0;
        int first=-1;
        while(start<=end){
            mid = start+(end-start)/2;
            if(array[mid]==target){
                first=mid;
                end=mid-1;
            }
            else if(array[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return first;
    }

    static int findLast(int[] array, int target) {
        int start = 0, end = array.length - 1;
        int last = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                last = mid;
                start = mid + 1; // move right
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return last;
    }

}
