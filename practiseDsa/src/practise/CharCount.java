package practise;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        String str = "aaabbbbcc";
//        int count=1;
//        String ans = "" + str.charAt(0);
//        
//        for (int i=1; i<str.length(); i++) {
//        	char curr = str.charAt(i);
//        	char pre = str.charAt(i-1);
//        	if (curr == pre) {
//        		count++;
//        	}
//        	else {
//        		ans = ans + count;
//        		count = 1;
//        		ans = ans + curr;
//        	}
//        }
//        ans = ans + count;
//        System.out.println(ans);
		String str = "aaabbbbccaa";
		int count = 1; // Initialize count to 1
		String res = "";

		// Loop through the characters of the string
		for (int i = 0; i < str.length() - 1; i++) {
		    if (str.charAt(i) == str.charAt(i + 1)) {
		        count++; // Increment count if consecutive characters are the same
		    } else {
		        res += str.charAt(i) + String.valueOf(count);
		        count = 1; // Reset count for the next character
		    }
		}

		// Add the last character and its count
		res += str.charAt(str.length() - 1) + String.valueOf(count);

		System.out.println(res);
		
		String str2 = "Chethan";
		System.out.println(str2.length());
		
		int count1=0;
		for(char ch:str2.toCharArray()) {
			if(ch!=' ') {
				count1++;
			}
		}
		System.out.println(count1);
        
       

}
}
