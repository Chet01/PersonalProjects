package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="My name is Chethan";
      String res="";
      char []arr = str.toCharArray();
      int left=0;
      int right=arr.length-1;
      while(left<right) {
    	  char temp=arr[left];
    	  arr[left]=arr[right];
    	  arr[right]=temp;
    	  left++;
    	  right--;
      }
      System.out.println(arr); 
      
	}
}
