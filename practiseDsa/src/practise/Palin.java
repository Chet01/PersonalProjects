package practise;

import java.util.Scanner;

public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number : ");
        double a = s.nextDouble();
//        String orig = Integer.toString(a);
//        if(orig.length()>4) {
//        	System.out.println("Input mismatch");
//        }
        double copy=a;
        double rev=0;
        while(copy!=0) {
        	double last = copy%10;
        	rev = rev * 10+last;
        	copy=copy/10;
        }
        
        if(rev==a) {
        	System.out.println(true);
        }
        else {
        	System.out.println(false);
        }
	}

}
