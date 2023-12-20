package practise;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,2,3,4,4,5,6};
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j]=arr[arr.length-1];
		int [] arr1 = new int[j];
		for(int k=0;k<=j;k++) {
			System.out.println(arr[k]);
		}
	}

}
