package practise;

public class DiamondPattern {

	public static void main(String[] args) {
		int num=9;
		// TODO Auto-generated method stub
        for(int i=1;i<=num;i++) {
        	for(int j=1;j<=num;j++) {
        		int mid=num/2;
        		for(int k=1;k<=mid-1;k++) {
        			System.out.print(" ");
        		}
        		if(i%2==1) {
        			System.out.print("*");
        		}
        	}
        	System.out.println();
        }
	}

}
