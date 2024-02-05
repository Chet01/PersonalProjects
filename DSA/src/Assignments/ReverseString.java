package Assignments;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str = "Captain Jack Sparrow";
      System.out.println(str.charAt(0));
      System.out.println(str.charAt(str.length()-1));
      String rev = "";
      for (int i = 0; i < str.length(); i++) {
    	  rev = str.charAt(i) + rev;
    	}
      System.out.println(rev);
	}

}
