package practise;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str1 = "Hello";
      String str2 = "lo";
      int count=0;
      char[] arr = str2.toCharArray();
      for(int i=0;i<str1.length();i++) {
    	  for(int j=0;j<str2.length();j++) {
    		  if(str2.charAt(j)==str1.charAt(i)) {
    			  count++;
    		  }
    	  }
      }
      if(count==str2.length()) {
    	  System.out.println("s2 is a substring of s1");
      }
	}

}
