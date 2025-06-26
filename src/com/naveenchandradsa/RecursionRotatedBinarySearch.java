package com.naveenchandradsa;

public class RecursionRotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 1, 2, 3, 4, 5};
        System.out.println(search(arr, 0, arr.length - 1, 4));
    }

    static int search(int[] arr, int start, int end, int target) {
        int mid = start + (end - start) / 2;
        if(start > end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
            if(arr[start] <= arr[mid]){
                if(target >= arr[start] && target <= arr[mid]){
                    return search(arr, start, mid - 1, target);
                }
                else{
                    return search(arr, mid + 1, end, target);
                }
            }
            if(target >= arr[mid] && target<= arr[end]){
                return search(arr, mid + 1, end, target);
            }
            else{
                return search(arr, start, mid - 1, target);
            }
    }
}