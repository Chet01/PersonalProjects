package org.example.BinarySearch;

public class PivetElementInArray {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,5,1};
        int pivetIndex = findPivet(array);
        System.out.println(pivetIndex);
    }

    private static int findPivet(int[] array) {
        int start=0;
        int end=array.length-1;
        int mid = 0;
        while(start<end){
            mid = start+(end-start)/2;
            if(array[mid]>array[mid+1]){
                end = mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}

// pattern is
