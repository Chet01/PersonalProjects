package Patterns;

public class Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=5;
      for(int i=1;i<=2*n;i++) {
    	  int totalCol = i>n ? 2*n-i:i;
    	  
    	  for(int j=1;j<=totalCol;j++) {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
	}

}
