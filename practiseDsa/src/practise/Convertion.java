package practise;

import java.util.Arrays;
import java.util.Scanner;

public class Convertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        String res="";
        for(int i=0;i<arr.length;i++) {
//        	if(Character.isAlphabetic(arr[i])||arr[i]==' ') {
        	if(Character.isUpperCase(arr[i])) {
        		res+=Character.toLowerCase(arr[i]);
        	}
        	else {
        		res+=Character.toUpperCase(arr[i]);
        	}
//        	}
//        	else {
//        		continue;
//        	}
        }
        System.out.println(str);
        System.out.println(res);
        
        String hel = "Hello Chethan 123 Hello Chethan 123";
//        String res="";
//        String a;
//        String b;
        for(int i=0;i<hel.length();i++) {
        	if(Character.isAlphabetic(hel.charAt(i))||hel.charAt(i)==' ') {
        		continue;
        	}
        	else {
        		res+=hel.charAt(i);
        	}
        }
        int b = 0;
//        int a=Integer.parseInt(res)+Integer.parseInt(res1);
          String res1="";
          for(char ch:res.toCharArray()) {
        	  res1+=ch;
          }

          for(int i=0;i<res.length();i++) {
        	  if(i<=2) {
        		  res1+=res.charAt(i);
        	  }
        	  else if(i==3) {
        		  res1+=' ';
        	  }
        	  else {
        		  res1+=res.charAt(i);
        	  }
          }
          
          String a = res.substring(0, 3);
          String c = res.substring(3, 6);
          int result = Integer.parseInt(a)+Integer.parseInt(c);

          System.out.println(result);
        }

}
