package Assignments;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = " chetan Sakaria";
        String res="";
        for(int i=0;i<str.length();i++) {
        	if(!((str.charAt(i)=='a')||(str.charAt(i)=='i')||(str.charAt(i)=='e'))) {
        		res+=str.charAt(i);
        	}
        }
        System.out.println(res);
	}

}
