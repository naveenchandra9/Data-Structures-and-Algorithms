package com.naveenchandradsa;

public class BinarySearchRecursion {
    public static void main(String[] args){
        int[] arr = {1, 4, 5, 7, 8, 11, 15, 19, 42, 89, 100};
        int target = 1;
        System.out.println(bsRecursion(arr, target, 0, arr.length - 1));
    }

    static int bsRecursion(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] > target){
            return bsRecursion(arr, target, start, mid - 1);
        }
        else{
            return bsRecursion(arr, target, mid + 1, end);
        }
    }
}
