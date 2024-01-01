package practise;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr = {1,2,3,5};
        int j=arr[0];
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==j) {
        		j++;
        	}
        	else {
        		break;
        	}
        }
        System.out.println(j);
	}

}
