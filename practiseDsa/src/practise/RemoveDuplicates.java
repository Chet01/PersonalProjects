package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,30,50,20));
		Collections.sort(list);
		//after sorting
		System.out.println("before removal of duplicates : "+list);
	    for(int i=0;i<list.size()-1;i++) {
	    	if(list.get(i)==list.get(i+1)) {
	    		list.remove(i+1);
	    	}
	    	else {
	    		continue;
	    	}
	    }
	    System.out.println("After removal of dplicates : "+list);
	    
	    
	}
//[10,20,30,20,40,10,50,20]
//check weater string is palindrome are not ="A man, a plan,a canal, Panama!"		
}
