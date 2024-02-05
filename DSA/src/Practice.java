import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=3322251;
		 String myString = Integer.toString(n);
	        char[] arr = myString.toCharArray();
	        HashMap<Character,Integer> map = new HashMap<>();
	        if(n<=1){
	           System.out.println(n);
	        }
	         for(char ch:arr) {
	    	  if(!map.containsKey(ch)) {
	    		  map.put(ch, 1);
	    	  }
	    	  else {
	    		  map.put(ch, map.get(ch)+1);
	    	  }
	      }
	       String res="";
	       
	       for(int i=0;i<arr.length;i++) {
//	    		   System.out.println(res);
	    		   while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
	                   i++;
	               }
	    		   res+=Integer.toString(map.get(arr[i]))+arr[i];
	       }
	       System.out.println(res);
	}

}
