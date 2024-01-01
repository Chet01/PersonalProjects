package practise;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String []strs= {"flower","flow","flight"};
      Arrays.sort(strs);
      int idx=0;
      for(int i=0;i<strs.length;i++) {
    	  for(int j=1;j<strs[i].length();j++) {
    		  if(strs[i].charAt(i)==strs[i].charAt(j)) {
    			  idx++;
    		  }
    	  }
      }
      System.out.println(strs[0].substring(0, idx));
	}

}
