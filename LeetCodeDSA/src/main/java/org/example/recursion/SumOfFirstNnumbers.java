package org.example.recursion;

public class SumOfFirstNnumbers {
    public static void main(String[] args){
        int sum = 0;
        int start = 1;
        int result = sumOFFirstNnumbers(start, 10, sum);
        System.out.println(result);   // ✅ print result
    }

    private static int sumOFFirstNnumbers(int start, int i, int sum) {
        if (start == i) {
            return sum;              // ✅ return sum
        }
        sum += start;
        start++;
        return sumOFFirstNnumbers(start, i, sum); // ✅ return recursive call
    }
}
