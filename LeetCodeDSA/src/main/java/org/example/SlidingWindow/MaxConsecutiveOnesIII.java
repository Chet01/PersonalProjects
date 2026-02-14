package org.example.SlidingWindow;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args){
        int[] array = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k=2;
        int left=0;
        int maxLength=0;
        int zeroes=0;
        for(int right=0;right<array.length;right++){
            if (array[right] == 0) {
                zeroes++;
            }

            // 🔴 FIX 1: shrink window UNTIL it becomes valid
            while (zeroes > k) {
                if (array[left] == 0) {
                    zeroes--;   // 🔴 FIX 2: maintain correct zero count
                }
                left++;
            }

            // valid window → update answer
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);
    }
}
