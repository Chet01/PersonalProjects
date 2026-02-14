package org.example.BinarySearch;

public class SearchSingleElementInSortedArray {
    public static void main(String[] args){
        int[] array = {1,1,2,2,3,3,4,5,5,6,6};
        int distinct = searchDistinctElement(array);
        System.out.println(distinct);
    }

    private static int searchDistinctElement(int[] array) {
        if(array[0]!=array[1]){
            return array[0];
        }
        int start=1;
        int end=array.length-2;
        int mid=0;
        int unique = -1;
        while(start<=end){
            mid = start+(end-start)/2;
            if(array[mid]!=array[mid+1] && array[mid]!=array[mid-1]){
                return mid;
            }
            else if(mid%2==1 && array[mid]==array[mid-1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
}

//pattern is  1,1,2,2,3,3,4,5,5,6,6
//index       0 1 2 3 4 5 6 7 8 9 10

//observation if( even odd are same 3,3 > 4,5  --- element is in right order
//            if( odd even are same 5,5 > 7,8  --- element is in left order
