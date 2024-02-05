package practise;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
	    int n = 101;
		int s=n;
        int res=0;
        int rem=0;
        while(s!=0) {
        	res=s%10;
        	rem = rem *10 + res;
        	s=s/10;
        }
        if(n==rem) {
        	System.out.println(n+" is a palindrome");
        }
        else {
        	System.out.println(n+" is not a palindrome");
        }
//        */
//		int n=7;
//		int count=0;
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.println(n+" is a prime number");
//		}
//		else {
//			System.out.println(n+" is not a prime number");
//		}
        
	}

}
