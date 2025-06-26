package com.naveenchandradsa;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {7, 9, 8, 2, 6, 0};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int lo, int hi){
        if(lo >= hi){
            return;
        }
        int mid = lo + (hi - lo)/2;
        int pivot = mid;
        int start = lo;
        int end = hi;
        while(start < end){
            while(arr[start] < arr[pivot]){
                start++;
            }
            while(arr[end] > arr[pivot]){
                end--;
            }
            if(start<=end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        sort(arr, lo, end);
        sort(arr, start, hi);
    }
}
