package practise;

import java.util.Arrays;

public class TwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr1 = {0,0,2,1,2,1,0,1};
        int[] arr2= new int[arr1.length];
        int count=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<arr1.length;i++) {
        	if(arr1[i]==0) {
        		count++;
        	}
        	else if(arr1[i]==1){
        		count1++;
        	}
        	else {
        		count2++;
        	}			
        }
        
        System.out.println(count);
        System.out.println(count1);
        System.out.println(count2);
        for(int i=0;i<arr2.length;i++) {
        	if(i<count-1) {
        		arr2[i]=0;
        	}
        	else if(i > count+count1 - 1){
        		arr2[i]=1;
        	}
        	else if(i > count - 1) {
        		arr2[i]=2;
        	}
        	
        }
        
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
       
	}

}
