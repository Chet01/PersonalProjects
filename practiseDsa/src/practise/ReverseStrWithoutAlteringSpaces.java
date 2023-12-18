package practise;

public class ReverseStrWithoutAlteringSpaces {
	    public static void main(String[] args) {
	        String inputString = "Hello World, how are you?";
	        String reversedString = reverseStringWithoutSpaces(inputString);
	        System.out.println("Original string: " + inputString);
	        System.out.println("Reversed string: " + reversedString);
	    }

	    public static String reverseStringWithoutSpaces(String str) {
	        char[] charArray = str.toCharArray();
	        int left = 0;
	        int right = charArray.length - 1;

	        while (left < right) {
	            if (charArray[left] == ' ') {
	                left++;
	            } else if (charArray[right] == ' ') {
	                right--;
	            } else {
	                // Swap characters
	                char temp = charArray[left];
	                charArray[left] = charArray[right];
	                charArray[right] = temp;
	                left++;
	                right--;
	            }
	        }
	        return new String(charArray);
	    }
	}


