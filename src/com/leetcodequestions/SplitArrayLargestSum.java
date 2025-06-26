package com.leetcodequestions;
//https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        //setting start(case 1), when split allowed is equal to size of array(nums), then largest sum is the largest element in array
        //setting end(case 2), when split allowed is 1, which is array itself, then largest sum is sum of all elements in array
        for(int i=0; i<nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        return binarySearch(start,end,nums,k);
    }

    public int binarySearch(int start, int end, int[]nums, int k){
        while(start < end){
            int sum = 0;
            int pieces = 1;
            int mid = start + (end - start)/2;
            for(int num : nums){
                if((num + sum) > mid){ // if this is true, the new array will be created and increase piece by 1 and sum starting element of new array
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }
            if(pieces > k){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}
