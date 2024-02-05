package practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] languages = {"Java","Javascript","Python","C","C++","Java"};
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for(String str:languages) {
        	if(!set.contains(str)) {
        		set.add(str);
        	}
        	else {
        		list.add(str);
        	}
        }
        System.out.println(list);
        System.out.println(set);
        
        //another approach
        for(int i=0;i<languages.length;i++) {
        	for(int j=i+1;j<languages.length;j++) {
        		if(languages[i].equals(languages[j])) {
        			System.out.println(languages[i]);
        		}
        	}
        }
	}

}
