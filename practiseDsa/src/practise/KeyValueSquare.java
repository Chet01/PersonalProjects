package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class KeyValueSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<Integer,Integer> map = new HashMap<>();
      List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30));
      for(int i=0;i<list.size();i++) {
    	  map.put(list.get(i),list.get(i) * list.get(i));
      }
      for(Entry<Integer,Integer> entry : map.entrySet()) {
    	  System.out.println(entry.getKey() +" : "+entry.getValue());
      }
	}

}
