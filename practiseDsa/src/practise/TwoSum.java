package practise;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {12,43,21,54,6};
       int [] res=new int[2];
       int target=60;
       for(int i=0;i<arr.length;i++) {
    	  for(int j=1;j<arr.length;j++) {
    	   if(arr[i]+arr[j]==target) {
    		   res[0]=j;
    		   res[1]=i;
    	   }
    	  }
       }
       System.out.println(Arrays.toString(res));
	}

}
