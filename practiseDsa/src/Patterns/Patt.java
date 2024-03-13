package Patterns;

public class Patt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0,n=5;i<=n;i++) {
			for(int j=0;j<n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		
		for(int row=0,n=9;row<n;row++) {
        	for(int sp=0;sp<n-row-1;sp++) {
        		System.out.print(" ");
        	}
        	for(int col=0;col<=row;col++) {
        		System.out.print("* ");
        	}
        	System.out.println();
	    }
		
		for(int row=0,n=9;row<n;row++) {
        	for(int col=0;col<=row;col++) {
        		System.out.print(" ");
        	}
        	for(int sp=0;sp<n-row-1;sp++) {
        		System.out.print("* ");
        	}
        	System.out.println();
	    }

}
}

