package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class SortTheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "is2 sentence4 This 1a3";
		String[] str = s.split(" ");
	       Map<Integer,String> map = new HashMap<>(); 
	       for(String st:str){
	           int lastIndex = st.length()-1;
	           int ind = Character.getNumericValue(st.charAt(lastIndex));
	           String actualWord = st.substring(0, lastIndex);
	           map.put(ind, actualWord);
	       } 
			String val = "";
			String res = "";
			for (Entry<Integer, String> entry : map.entrySet()) {
				val = entry.getValue();
				res += val + " ";
			}
			System.out.println(res);
			if(s.contains("This")) {
				System.out.println(true);
			}
	}

}
