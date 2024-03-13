package practise;

import java.util.ArrayList;
import java.util.Collections;

public class Dupl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = {2,2,3,3,4,4,4,1};
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i:a) {
        	if(!list1.contains(i)) {
        		list1.add(i);
        	}
        }
        Collections.sort(list1);
        System.out.println(list1);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        
	}

}
