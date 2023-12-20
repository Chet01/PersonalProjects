package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapPractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map  = new HashMap<>();
		List<Integer> values = new ArrayList<>();
		List<String> keys = new ArrayList<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        for(Entry<String,Integer> entry : map.entrySet()) {
        	values.add(entry.getValue());
        }
        for(Entry<String,Integer> entry : map.entrySet()) {
        	keys.add(entry.getKey());
        }
        System.out.println(keys +" : "+ values);
	}

}
