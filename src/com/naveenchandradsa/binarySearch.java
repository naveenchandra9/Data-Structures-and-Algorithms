package com.naveenchandradsa;
import java.util.*;

public class binarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {-9, -6, -3, 0, 2, 4 ,6, 8, 9, 13, 28, 56, 89};
        int target = sc.nextInt();
        System.out.println(searchUsingBinary(arr, target));
    }

    public static int searchUsingBinary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
