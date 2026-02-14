package org.example.SlidingWindow;

public class MaximumAverageSubArrayI {
    public static void main(String[] args){
        int[] array = {1,12,-5,-6,50,3};
        int k = 4;

        int sum = 0;
        int left = 0;
        int right = k-1;
        float maxSum=0;
        float maxAverage=0;
//        for constant window like first take that sum and store
        for(int i=0;i<=right;i++){
            sum+=array[i];
        }

//        after that iterate from k to n-1 and simultaneously substact the left most digit wxpand and shrink then compare max sum by adding right element
        while(right< array.length-1){
            sum=sum-array[left];
            left++;
            right++;
            sum=sum+array[right];
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println(maxSum);
        maxAverage = maxSum/k;
        System.out.println(maxAverage);


    }
}
