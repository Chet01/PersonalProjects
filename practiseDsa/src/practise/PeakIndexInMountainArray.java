package practise;

public class PeakIndexInMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr= {2,3,4,5,6,4,3,2};
        int i=0;
        while(i<arr.length-1) {
        	if(arr[i]>arr[i+1]) {
        		break;
        	}
        	i++;
        }
        System.out.println(arr[i]);
	}

}
