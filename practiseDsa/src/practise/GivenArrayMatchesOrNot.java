package practise;

import java.util.Arrays;

public class GivenArrayMatchesOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr1 = {1, 2, 5, 2, 1};
        int[] arr2 = {2, 1, 2, 1, 5};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean val=false;
        
        if (arr1.length != arr2.length) {
            val=false;
        }
        for(int i=0;i<arr1.length;i++) {
        	if(arr1[i]!=arr2[i]) {
        		val=false;
        	}
        	else {
        		val=true;
        	}
        }
        if(val==true) {
        	System.out.println("Arrays got matched!");
        }
        else {
        	System.out.println("Arrays didn't get matched!");
        }
	}

}
