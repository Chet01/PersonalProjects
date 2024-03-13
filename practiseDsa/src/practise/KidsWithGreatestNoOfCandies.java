package practise;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNoOfCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []candies = {4,2,5,1,3};
		 int extraCandies=3;
		 List<Boolean> list = new ArrayList<>();
	        int large = candies[0];
	        for(int i=1;i<candies.length;i++){
	                if(candies[i]>large){
	                    large=candies[i];
	                }
	        }
//	        int small=0;
//	        for(int i=1;i<candies.length;i++){
//                if(candies[i]<large){
//                    small=candies[i];
//                }
//            }
	        System.out.println(large);
//	        System.out.println(small);
	        for(int k=0;k<candies.length-1;k++){
	            if(!(candies[k]+extraCandies>=large)){
	                list.add(false);
	            }
	            list.add(true);
	        }
	        System.out.println(list);
	}

}
