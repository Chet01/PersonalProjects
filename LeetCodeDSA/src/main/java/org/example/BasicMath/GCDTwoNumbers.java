package org.example.BasicMath;

import java.util.ArrayList;
import java.util.List;

public class GCDTwoNumbers {
   public static void main(String[] args){
       int num1 = 20;
       int num2 = 15;
       ArrayList<Integer> num1List = new ArrayList<>();
       ArrayList<Integer> num2List = new ArrayList<>();
       int start=1;
           while (start<=num1) {
               if(num1 % start == 0) {
                   num1List.add(start);
                   start++;
               }
               else{
                   start++;
               }
           }

       int j=1;
       while(j<=num2){
           if(num2 % j==0) {
               num2List.add(j);
               j++;
           }
           else{
               j++;
           }
       }
       System.out.println(num1List);
       System.out.println(num2List);
       List<Integer> common = num1List.stream()
               .filter(num2List::contains)
               .distinct()
               .toList();
       System.out.println(common);
   }
}
