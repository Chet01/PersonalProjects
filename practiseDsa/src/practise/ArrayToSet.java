package practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;


public class ArrayToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[] = {2, 4, 7, 5, 5, 69};
		Set<Integer> s = new HashSet<>(Arrays.asList(a));
		System.out.println(s);
		String str = "chandrdeppaaaallalala";
		String res = "";
		char[] arr = str.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] == 'a') {
		    	count++;
		        if(count==2) {
		        	continue;
		        }
		        res+=arr[i];
		    } else {
		        res += arr[i];
		    }
		}
//		System.out.println(res);

	String str1 = "chandrdeppaaaallalala";
	char[] arr1 = str1.toCharArray();
	int counter = 0;
	String res1="";
	for (int j = 0; j < arr.length; j++) {
		if(arr[j]=='a') {
			counter++;
			if(counter==1) {
				res1+=arr[j];
			}
			continue;
		} else {
	        res1+= arr[j];
	        }
		}
	System.out.println(res1);
	}
}
	


