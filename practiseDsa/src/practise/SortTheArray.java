package practise;

import java.util.Arrays;

public class SortTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -1,20,40, 10, 30, 50, 70, 80 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length-i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

        System.out.println(arr[arr.length-3]);
        
	}

}
