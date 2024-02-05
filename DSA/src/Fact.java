
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//factorial
//        int fact=1;
//        int num=5;
//        for(int i=1;i<=num;i++) {
//        	fact=fact*i;
//        }
//        System.out.println(fact);
        
        //sort using values in hashMap
//        Map<Character,Integer> map1 = new HashMap<>();
//        map1.put('a', 2);
//        map1.put('c', 1);
//        map1.put('v', 4);
//        map1.put('d', 5);
//        List<Integer> list = new ArrayList<>();
//        for(Entry<Character,Integer> entry:map1.entrySet()) {
//        	list.add(entry.getValue());
//        }
//        Collections.sort(list);
//        System.out.println(list);
        
        //count the occurence of each character
		  String str = "ababccddee";
		  char[] arr = str.toCharArray();
		  Map<Character,Integer> map = new HashMap();
		  for(char ch:arr) {
			  if(!map.containsKey(ch)) {
				  map.put(ch, 1);
			  }
			  else {
				  map.put(ch, map.get(ch)+1);
			  }
		  }
		  System.out.println(map);
		  
		  List<Integer> list = new ArrayList<>();
		  
		  for(Entry<Character,Integer> entry:map.entrySet()) {
			  list.add(entry.getValue());
		  }
		  
		  int count=0;
		  for (int i = 0; i <=list.size()-1; i++) {
			  int j=list.get(0);
	            if(list.get(i)==j) {
	            	count++;
	            }
	        }
		  if(count==5) {
			  System.out.println("TRUE");
		  }
		  else {
			  System.out.println("FALSE");
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  //code to remove special characters
//		  String st = "My n@;me is Cheth@n";
//		  st.replaceAll("[^0-9a-zA-Z]"," ");
//		  System.out.println(st);
//		  
//		  String s = "C";
//		  String s1 = "Chethannnn";
//		  int start=s.length();
//		  while(start<=s1.length()*s1.length()) {
//			  System.out.println(start);
//			  start++;
//		  }
		  
	}

}