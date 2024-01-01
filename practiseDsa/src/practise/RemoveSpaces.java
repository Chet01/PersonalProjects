package practise;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str = "    My name is Chethan    ";
      String[] arr = str.split(" ");
      String res="";
      for(String st:arr) {
    	  res+=st;
      }
      System.out.println(res);
	}

}
