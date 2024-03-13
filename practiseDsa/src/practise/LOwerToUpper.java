package practise;

public class LOwerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String st = "my NaME is PaaAvVvAaAnN";
        String str="";
        for(int i=0;i<st.length();i++) {
        	if(Character.isLowerCase(st.charAt(i))) {
        		str+=Character.toUpperCase(st.charAt(i));
        	}
        	else {
        		str+=Character.toLowerCase(st.charAt(i));
        	}
        }
        System.out.println(st);
        System.out.println(str);
        if(!st.equals(str)) {
        	System.out.println("Converted successfully!");
        }
	}

}
