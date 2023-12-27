package practise;

import java.util.Arrays;

public class Sortzeroesandones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {1,1,0,0,1,0,1};
        int count=0;
        int size = arr.length;
        for(int i=0;i<size-1;i++) {
        	if(arr[i]==0) {
        		count++;
        	}
        }
        for(int j=0;j<size;j++) {
        	if(j<count) {
        	  arr[j]=0;
        	}
        	else {
        		arr[j]=1;
        	}
        }
        
        System.out.println(Arrays.toString(arr));
        
	}

}
