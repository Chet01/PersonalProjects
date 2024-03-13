package practise;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ch = "My name is Chethan";
        String[] arr = ch.split(" ");
        String rev="";
        for(String str:arr) {
        	StringBuilder sb = new StringBuilder(str);
        	rev+=sb.reverse()+" ";
        }
        System.out.println(rev);
	}

}
