package practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Duplicates {
    public static void main(String[] args) {
        String input = "Automation test engineer";
        Set<Character> set = new HashSet<>();
        List<Character> list = new ArrayList();
        for(int i=0;i<input.length();i++){
            if(!set.contains(input.charAt(i))){
                set.add(input.charAt(i));
            }
            else{
                list.add(input.charAt(i));
            }
        }
        for(char ch:set){
            System.out.println(ch+" ");
        }
    }
}
