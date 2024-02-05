
public class tamboola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr = {2,7,13,17,43};
      int target = 15;
      int [] res = new int[2];
      		
		for (int i = 0; i < arr.length - 1; i++) {
    	for(int j=i+1;j<arr.length-1;j++) {
			
				if (arr[i] + arr[j] == target) {
					res[0] = i;
					res[1] = j;
					break;
				}
			}
		}
		System.out.println(res[0]);
		System.out.println(res[1]);
	}
}




