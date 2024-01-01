package practise;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String []strs= {"flower","flow","flight"};
      Arrays.sort(strs);
      int idx=0;
      for(int i=0;i<strs.length;i++) {
    	  if(strs[0].indexOf(i)==strs[1].indexOf(i)) {
    		  idx++;
    	  }
      }
      System.out.println(strs[0].substring(0, idx-1));
	}

}
