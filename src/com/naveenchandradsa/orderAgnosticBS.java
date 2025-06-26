package com.naveenchandradsa;

import java.util.Scanner;

public class orderAgnosticBS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int[] arr = {-9, -6, -3, 0, 2, 4 ,6, 8, 9, 13, 28, 56, 89};
        int[] arr = {100, 76, 64, 44, 31, 10, 5, 1, -3, -8, -9};
        int target = sc.nextInt();
        System.out.println(searchUsingBinary(arr, target));
    }

    public static int searchUsingBinary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
