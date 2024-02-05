package practise;

public class CheckForPalindrome {

	public static void main(String[] args) {
		// check for
//		String pal = "Chethan";
//		String res ="";
//		for(int i=pal.length()-1;i>=0;i--) {
//			res+=pal.charAt(i);
//		}
//        if(res.equals(pal)) {
//        	System.out.println("String is palindrome");
//        }
//        else {
//        	System.out.println("String is not a palindrome");
//        }
		String s="A man, a plan, a canal: Panama";
		String str = s.replaceAll("[^a-zA-Z0-9\\s]", "");
		String [] arr1 = str.split(" ");
		String check = "";
		for(String st:arr1) {
			check+=st;
		}
		System.out.println(check);
		String result="";
		for(int i=check.length()-1;i>=0;i--) {
			result+=check.charAt(i);
		}
		System.out.println(check+" : "+result);
		if(check.toLowerCase().equals(result.toLowerCase())) {
			System.out.println("Given string : "+s+" after removal of special characters is palindrome : "+result);
		}
		else {
			System.out.println("Not a palindrome");
		}		
}
}
