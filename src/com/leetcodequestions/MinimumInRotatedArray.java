package com.leetcodequestions;

public class MinimumInRotatedArray {
    public int findMin(int[] nums) {
        if(nums[0] < nums[nums.length - 1]){
            return nums[0];
        }
        int min = findMinimumElement(nums);
        return nums[min];
    }

    public int findMinimumElement(int[] nums){
        int start = 0;
        int end = nums.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid + 1]){
                return mid + 1;
            }
            else if(nums[mid - 1] > nums[mid]){
                return mid;
            }
            else if(nums[start] < nums[mid]){
                start = mid;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}

