package Patterns;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=5;
	      for(int i=0;i<=2*n;i++) {
	    	  int totalCol = i>n ? 2*n-i:i;
	    	  
	    	  int numOfSpaces = n-totalCol;
	    	  for(int k=0;k<numOfSpaces;k++) {
	    		  System.out.print(" ");
	    	  }
	    	  
	    	  for(int j=0;j<=totalCol;j++) {
	    		  System.out.print("* ");
	    	  }
	    	  System.out.println();
	      }
	}

}
