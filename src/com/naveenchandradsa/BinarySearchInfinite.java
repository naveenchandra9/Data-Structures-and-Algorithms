package com.naveenchandradsa;

public class BinarySearchInfinite {
    public static void main(String[] args){
        int[] arr = {0, 4, 5, 7, 8, 91, 100, 180};
        int target = 180;
        System.out.println(findIndex(arr, target));
    }

    static int findIndex(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target >= arr[end]){
            //new start will be index next of prev end
            int newStart = end + 1;
            //new end will be prev arr size * 2 + prevEnd
            end = end + ((end - start) + 1) * 2;
        }
        //send these indexes to binarysearch method
        int indexOfTarget = binarySearch(arr, target, start, end);
        return indexOfTarget;
    }

    static  int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
           int mid = start + (end - start)/2;
           if(arr[mid]  == target){
               return mid;
           }
           else if(arr[mid] > target){
               end = mid - 1;
           }
           else{
               start = mid + 1;
           }
        }
        return -1;
    }
}
