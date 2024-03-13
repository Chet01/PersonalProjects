package practise;

import java.util.ArrayList;

public class FetchVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s  = "Pavan kumar";
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
        		if(!list.contains(s.charAt(i))) {
        			list.add(s.charAt(i));
        		}
        	}
        }
        System.out.println(list);
	}

}
