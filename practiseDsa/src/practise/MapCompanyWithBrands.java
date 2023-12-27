package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapCompanyWithBrands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> brands = new ArrayList<>(Arrays.asList("Sony","Lg","Samsung"));
      List<String> products = new ArrayList<>(Arrays.asList("Bravia1","TV","Galaxy","Bravia2"));
      for(String str: products) {
    	  if(str.contains("Bravia")) {
    		  System.out.println(brands.get(0)+" : "+str);
    	  }
    	  else if(str.contains("TV")) {
    		  System.out.println(brands.get(1)+" : "+str);
    	  }
    	  else {
    		  System.out.println(brands.get(2)+" : "+str);
    	  }
      }
	}

}

//a=zero one seven two three five one two