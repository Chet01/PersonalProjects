package Assignments;

import java.util.Arrays;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int []nums= {1,2,3,4,5,6,7};
	   int start=0;
	   int k=3;
	   int end=nums.length-1;
       reverse(start,end,nums);
       reverse(start,k-1,nums);
       reverse(k,end,nums);
       System.out.println(Arrays.toString(nums));
	}

	private static void reverse(int start, int end, int[] nums) {
		// TODO Auto-generated method stub
		while(start<end) {
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
		
	}

}
