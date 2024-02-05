package Patterns;

public class ChristmasTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        for(int row=0;row<n;row++) {
        	for(int sp=0;sp<n-row-1;sp++) {
        		System.out.print(" ");
        	}
        	for(int col=0;col<=row;col++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        for(int i=0;i<n-1;i++) {
        	for(int j=0;j<=i;j++) {
        		System.out.print(" ");
        	}
        	
        	for(int k=0;k<n-i-1;k++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}

}
