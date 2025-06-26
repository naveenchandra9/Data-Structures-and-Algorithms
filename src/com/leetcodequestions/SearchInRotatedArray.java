package com.leetcodequestions;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedArray {
    public static void main(String[] args){

    }
    static int search(int[] nums, int target) {
        //if array is not rotated
        if(nums[0] < nums[nums.length -1]){
            return binarySearch(nums, target, 0, nums.length -1);
        }
        // find pivot or peak element in rotated array
        int pivot = findPeakElement(nums);
        System.out.println(pivot);
        if(target == nums[pivot]){
            return pivot;
        }
        else if(nums[0] <= target){
            return binarySearch(nums, target, 0, pivot - 1);
        }
        else{
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            // when mid element is greater than its next element we are ait descending pair
            // in array
            if (nums[mid] > nums[mid + 1]) {
                return mid;
            }
            // when mid element is second element in descending pair
            else if (nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            // when mid element is in asc part before pivot
            else if (nums[start] < nums[mid]) {
                start = mid;
            }
            // when mid in asc part after pivot
            else {
                end = mid - 1;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
