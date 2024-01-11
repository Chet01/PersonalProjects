package practise;

public class CountSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is Chethan Kumar N";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
        System.out.println(count);
	}

}
