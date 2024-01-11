package practise;

import java.util.HashMap;
import java.util.Map;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Chethan";
		Map<Character,Integer> map = new HashMap<>(); 
        char[] arr = str.toCharArray();
        for(char ch:arr) {
        	if(map.containsKey(ch)) {
        		map.put(ch, map.get(ch)+1);
        	}
        	else {
        		map.put(ch,1);
        	}
        }
        System.out.println(map);
	}

}
