package org.example.BasicMath;

public class CountDigits {
    public static void main(String[] args) {
        int number = 12345;
        int counter=0;
        while(number!=0){
            number=number/10;
            counter++;
            if(number==0){
                break;
            }
        }
        System.out.println(counter);

    }
}
