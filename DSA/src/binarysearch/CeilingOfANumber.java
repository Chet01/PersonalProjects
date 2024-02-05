package binarysearch;

public class CeilingOfANumber {

	public static void main(String[] args) {
		int[] arr = {12,34,55,66,77,79,83};
		int ceilingOFNumber = CeilingOFNumber(arr,37);
		System.out.println(ceilingOFNumber);
		// TODO Auto-generated method stub
	}

	public static int CeilingOFNumber(int[] arr, int target) {
		int start = 0;
		int end = arr.length;
		int mid=0;
		while(start<=end) {
			mid=start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				return arr[mid];
			}
		}
		return arr[start];
	}

}
