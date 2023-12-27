package practise;

public class SwapCommasAndPullstops {
	
	public static void main(String[] args) {
		String str = "14, 625, 498.002";
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==',') {
				arr[i]='.';
			}
			else if(arr[i]=='.'){
				arr[i]=',';
			}
		}
		String res="";
		for(char ch:arr) {
			res+=ch;
		}
		System.out.println(res);
	}

}
