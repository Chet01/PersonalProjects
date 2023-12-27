package practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterRepeatCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str = "aaabbbbccdddd";
      StringBuilder result = new StringBuilder();
      //via hashMap
      Map<Character,Integer> charCount = new HashMap<>();
      for(Character ch:str.toCharArray()) {
    	  if(charCount.containsKey(ch)) {
    		  charCount.put(ch,charCount.get(ch)+1);
    	  }
    	  else {
    		  charCount.put(ch, 1);
    	  }
      }
      for(Entry<Character,Integer> entry : charCount.entrySet()) {
    	  result.append(entry.getKey()).append(entry.getValue());
      }
      System.out.println(result);
	}

}
