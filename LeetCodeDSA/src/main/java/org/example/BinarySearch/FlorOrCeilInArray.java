package org.example.BinarySearch;

public class FlorOrCeilInArray {
    public static void main(String[] args){
        int[] array = {3, 4, 4, 7, 8, 10};
        int n = 6;
        int x = 8;
        int ceil = 0;
        int flor = 0;

        int floor = findFloor(array,x);
        System.out.println(floor);
    }

    public static int findFloor(int[] array, int x) {
        int start=0;
        int end = array.length-1;
        int mid = 0;
        int flor = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(array[mid]<=x){
                flor = array[mid];
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return flor;
    }
}
