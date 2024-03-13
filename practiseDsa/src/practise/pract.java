package practise;

import java.util.ArrayList;
import java.util.Arrays;

public class pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str =  "my name is chethan";
        System.out.println(str);
        char[] arr = str.toCharArray();
        String res="";
        String res1="";
        int count=0;
        int counter=0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]=='m') {
        		if(arr[i]=='m') {
        			count++;
        		}
        		if(count<=1) {
        			res+=arr[i];
        		}
        		else {
        			continue;
        		}
        		
        	}
        	else {
        		res+=arr[i];
        	}
        }
        System.out.println(res);
        char[] arr1=res.toCharArray();
        for(int i=0;i<arr1.length;i++) {
        	if(arr1[i]=='a') {
        		if(arr1[i]=='a') {
        			counter++;
        		}
        		if(counter<=1) {
        			res1+=arr1[i];
        		}
        		else {
        			continue;
        		}
        		
        	}
        	else {
        		res1+=arr1[i];
        	}
        }
        System.out.println(res1);
	}

}
