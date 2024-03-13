package practise;

public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int num=7;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("It is a prime Number : "+num);
		}
	}

}
