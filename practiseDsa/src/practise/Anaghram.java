package practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Anaghram
{    
	public static void main(String[] args) {
		boolean res = isAnagram("geeksforgeeks","forgeeksgeeks");
		System.out.println(res);
	}
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
    	char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        return(Arrays.equals(A,B));
       
    }
}
