package practise;

import java.util.Arrays;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr = {12,43,3,34,56,78,98,44};
        for(int i=0;i<arr.length;i++) {
        	for(int j=1;j<(arr.length-i);j++) {
        		if(arr[j-1]>arr[j]) {
        			int temp = arr[j-1];
        			arr[j-1]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        System.out.println("min value is : "+arr[0]);
        System.out.println("min value is : "+arr[arr.length-1]);
        System.out.println(Arrays.toString(arr));
       
	}

}
