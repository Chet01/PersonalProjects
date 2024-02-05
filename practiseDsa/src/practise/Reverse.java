package practise;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str = "A man, a plan, a canal: Panama";
      str = str.replaceAll("[^a-zA-Z0-9]", "");
      System.out.println(str);
      String res="";
      for(int i=str.length()-1;i>=0;i--) {
    	  res+=str.charAt(i);
      }
      System.out.println(res);
      String check = res;
      String com="";
      for(int i=check.length()-1;i>=0;i--) {
    	  com+=check.charAt(i);
      }
      System.out.println(check.equalsIgnoreCase(com));
	}

}
