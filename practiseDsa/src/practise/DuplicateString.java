package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>(Arrays.asList("Chethan","Sakariya","Salaar","Chethan"));
        HashSet<String> set = new HashSet<>();
        List<String> list1 = new ArrayList<>();
        for(String str: list) {
        	if(!list1.contains(str)) {
        		list1.add(str);
        	}
        }
        System.out.println(list1);
	}

}
