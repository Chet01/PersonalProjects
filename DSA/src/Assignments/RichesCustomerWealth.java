package Assignments;

import java.util.Arrays;

public class RichesCustomerWealth {

	public static void main(String[] args) {
		int [][]accounts = {{1,5},{7,3},{3,5}};
		int result = maximumWealth(accounts);
        System.out.println(result);

}

	private static int maximumWealth(int[][] accounts) {
		 int[] res1=new int[accounts.length];
	        int res=0;
	        for(int i=0;i<accounts.length;i++){
	            for(int j=0;j<accounts[i].length;j++){
	                res=res+accounts[i][j];
	            }
	            res1[i]=res;
	            res=0;
	        }
	        int assume=res1[0];
	        for(int i=1;i<res1.length;i++){
	            if(assume<res1[i]){
	                assume=res1[i];
	            }
	        }
	        return assume;
	    }

}
