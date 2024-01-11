package practise;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
	  // TODO Auto-generated method stub
      int []arr = {2,32,12,12,43,65,55};
      int temp=0;
      for(int i=0;i<arr.length-1;i++) {
        if(arr[i]>arr[i+1]) {
        	temp=arr[i];
        	arr[i]=arr[i+1];
        	arr[i+1]=temp;
        }
	  }
      System.out.println(Arrays.toString(arr));
    
}
}
