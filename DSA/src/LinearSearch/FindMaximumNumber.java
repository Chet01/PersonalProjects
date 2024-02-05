package LinearSearch;

public class FindMaximumNumber {
   static int maxNumber(int[] arr) {
	   int max = arr[0];
	   for(int i=1;i<arr.length;i++) {
		   if(arr[i]>max) {
			   max = arr[i];
		   }
	   }
	return max;
	   
   }
   

public static void main(String[] args){
	int [] arr = {12,34,556,43};
	System.out.println("Max number of an array is : "+maxNumber(arr));
}
	
}
