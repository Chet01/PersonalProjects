package practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {10,9,4,5,6,7,8};
		int []res = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(res));
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Min is : "+arr[0]);
	    System.out.println("Max is : "+arr[arr.length-1]);
	    System.out.println(Arrays.toString(arr));
	    
	    String str1 = "Geeks for Geeks1";
	    String str2 = "Geeks for Geeks";
	    char[] arr1 = str1.toCharArray();
	    char[] arr2 = str2.toCharArray();
	    if(Arrays.equals(arr1, arr2) && str1.length()==str2.length()) {
	    	System.out.println("Strings are anagrams");
	    }
	    else {
	    	System.out.println("Strings are not anagrams!");
	    }
	    Set<Character> set = new HashSet<>();
	    for(int i=0;i<arr1.length;i++) {
	    	if(!set.contains(arr1[i])) {
	    		set.add(arr1[i]);
	    	}
	    }
	    for(char ch:set) {
	    	System.out.print(ch);
	    	System.out.println("---------");
	    }
        
	    //-----
	    int num=15;
	    if(num%3==0 && num%5==0) {
	    	System.out.println("FizzBuzz");
	    }
	    //-----
	    
	    String str = "poojaaa";
	    String res1="";
	    for(int i=0;i<str.length();i++) {
//	    	StringBuilder s = new StringBuilder(str.charAt(i));
	    	if(!res1.contains(String.valueOf(str.charAt(i)))){
	    		res1+=String.valueOf(str.charAt(i));
	    	}
	    }
	    System.out.println(res1);
	    
	    int[] arr3= {1,2,3,2,3,4,5,5};
	    Arrays.sort(arr3);
	    for(int i=0;i<arr3.length;i++) {
	    	for(int j=i+1;j<arr3.length;j++) {
	    		if(arr3[i]==arr3[j]) {
	    			arr3[j]=-1;
	    		}
	    	}
	    }
	    System.out.println(Arrays.toString(arr3));
	    for(int a:arr3) {
	    	if(a!=-1) {
	    		System.out.print(a);
	    	}
	    }
	}

}
