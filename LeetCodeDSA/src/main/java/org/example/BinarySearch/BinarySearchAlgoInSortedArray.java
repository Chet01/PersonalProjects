package org.example.BinarySearch;
//  algorithm time complexity

//  N/2 pow k = 1 -- > N = 2 pow K
// apply log on both sides
// log N = k log 2
// k = log N / log 2
// k = log(N/2)

// so total number of comparisions in the worst case is logN
// in best case it is Constant

public class BinarySearchAlgoInSortedArray {
    public static void main(String[] args){
        int[] array = {3,4,6,7,9,12,16,17};
        int target = 17;
        int result = binarySearchForGivenArray(array,target);
        if(result==-1){
            System.out.println("Element doesn't exist");
        }
        else{
            System.out.println("Index of target element is : "+result);
        }
    }

    public static int binarySearchForGivenArray(int[] array,int target) {
        int start = 0;
        int end = array.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end - start) / 2;
            if(array[mid]<target) {
                start=mid+1;
            }
            else if(array[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

