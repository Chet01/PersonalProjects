package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CountIterationOfEachCharacter {

	public static void main(String[] args) {
		 //count the iteration of each characters
		  String st="raghava";
		  int count=0;
		  char[] ar = st.toCharArray();
		  Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		  for(char ch: ar) {
			  if(charMap.containsKey(ch)) {
				  charMap.put(ch, charMap.get(ch)+1);
			  }
			  else {
				  charMap.put(ch, 1);
			  }
		  }
		  System.out.println(charMap);
		  List<Integer> list  = new ArrayList<>();
		  for(Entry<Character, Integer> val:charMap.entrySet()) {
			  list.add(val.getValue());
		  }
		  Collections.sort(list);
		  
		  System.out.println(list.get(list.size()-1));
		  char max=' ';
		  for(Entry<Character,Integer> entry:charMap.entrySet()) {
			  if(entry.getValue()==list.get(list.size()-1)) {
				 max = entry.getKey();
			  }
		  }
		  System.out.println("maximum character repeated is : "+max+" and count is : "+list.get(list.size()-1));
	}

}
