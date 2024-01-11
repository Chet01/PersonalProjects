package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int first=0;
       int second=1;
       int next=0;
       System.out.print(first+" ");
       System.out.print(second+" ");
       for(int i=1;i<10;i++) {
    	   next=first+second;
    	   first=second;
    	   second=next;
    	   System.out.print(next+" ");
       }
	}
}
