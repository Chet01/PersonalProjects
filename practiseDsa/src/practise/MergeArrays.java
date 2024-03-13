package practise;

import java.util.ArrayList;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:arr1) {
        	list.add(i);
        }
        for(int i:arr2) {
        	list.add(i);
        }
        System.out.println(list);
	}

}
