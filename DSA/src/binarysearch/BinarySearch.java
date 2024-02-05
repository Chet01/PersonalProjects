package binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr = {12,34,55,66,77,88,99,100};
		int [] arr1 = {12,22,07,33,88,101,12,22,100};
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,30,20,30,40,50));
		String[] country = {"India","USA","Australia","Germany"};
		int result = findTarrget(arr,99);
		System.out.println(result);
		Arrays.sort(arr1);
		Arrays.sort(country);
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(country));
		HashSet<Integer> set = new HashSet<Integer>(list);
		System.out.println(set);
		}

	public static int findTarrget(int[] arr,int target) {
		int start = 0;
		int end = arr.length;
		int mid=0;
		while(start<=end) {
			mid=start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	

}
