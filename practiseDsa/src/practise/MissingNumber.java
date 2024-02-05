package practise;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,4,5};
		int sum=0;
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int last = arr[arr.length-1];
		
		for(int i=arr[0];i<=last;i++) {
			sum1+=i;
		}
		int missingNum=sum1-sum;
		System.out.println(missingNum);

	}

}
