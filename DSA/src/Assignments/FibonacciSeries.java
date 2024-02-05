package Assignments;

import java.util.Arrays;

public class FibonacciSeries {

	public static void main(String[] args) {
//		int first = 0;
//		int second = 1;
//		int result;
//		System.out.print("Fibonacci series follows : ");
//		System.out.print(first+" "+second);
//		for(int i=2;i<10;++i) {
//			result = first+second;			
//			System.out.print(" "+result);
//			first=second;
//			second=result;
//		}
		int []nums= {1,2,3,4};
//		System.out.println(Arrays.toString(getConcatenation(nums)));
		System.out.println(Arrays.toString(runningSum(nums)));

	
}
    //problem statement : 1929. Concatenation of Array
    //url : https://leetcode.com/problems/concatenation-of-array/description/
	private static int[] getConcatenation(int[] nums) {
		int len = nums.length;
        int[] arr1 = new int[2*len];
        System.out.println(Arrays.toString(arr1));
        for(int i=0;i<nums.length;i++) {
        	arr1[i]=nums[i];
        }
        for(int j=len;j<arr1.length;j++) {
    		arr1[j]=nums[j-len];
    	}
        return arr1;
    }
	
	    public static int[] runningSum(int[] nums) {
	        for(int i=1;i<nums.length;i++){
	           nums[i]=nums[i]+nums[i-1];
	        }
	        return nums;
	    }
}
