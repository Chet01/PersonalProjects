package practise;

import java.util.Arrays;

public class Sort0s1s2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr = {1,2,1,0,2,0,1,2,1,0};
        int []arr1 = new int[arr.length];
        int count=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==0) {
        		count++;
        	}
        	else if(arr[i]==1) {
        		count1++;
        	}
        	else {
        		count2++;
        	}
        }
        System.out.println(count+" "+count1+" "+count2);
        
        for(int i=0;i<arr.length;i++) {
        	if(i<count) {
        		arr1[i]=0;
        	}
        	else if(i<count+count2) {
        		arr1[i]=2;
        	}
        	else {
        		arr1[i]=1;
        	}
        }
        System.out.println(Arrays.toString(arr1));
	}

}
