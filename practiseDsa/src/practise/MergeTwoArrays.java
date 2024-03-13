package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,5,6};
	    int[] arr2= {2,4,6,10,11,12};
	    int[] arr3= new int[arr1.length+arr2.length];
	    for(int i=0;i<arr1.length;i++) {
	    	arr3[i]=arr1[i];
	    }
	    int k = arr1.length;
        // Copy elements from arr2 to arr3
        for (int j = 0; j < arr2.length; j++) {
            arr3[k] = arr2[j];
            k++;
        }
	    
	    Arrays.sort(arr3);
	    System.out.println(Arrays.toString(arr3));
	    
	    ArrayList<Integer> list1 = new ArrayList<>();
	    for(int a:arr1) {
	    	list1.add(a);
	    }
	    for(int b:arr2) {
	    	list1.add(b);
	    }
	    Collections.sort(list1);
	    System.out.println(Arrays.toString(list1.toArray()));
	    System.out.println(arr1);
	    System.out.println(Arrays.toString(arr1));
	}

}
