package org.example.SlidingWindow;

public class LongestSubArrayOfOnesfterDeletingOneElement {
    public static void main(String[] args){
        int[] nums = {0,1,1,1,0,1,1,0,1};
        int left=0;
        int zeroCount=0;
        int maxLen = 0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                zeroCount++;
            }
            while(zeroCount>1){
                if(nums[left]==0) {
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen,right-left);
        }
        System.out.println(maxLen);
    }
}
