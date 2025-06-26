package com.naveenchandradsa;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {4, 5, 1, 2, 3,-7, 0};
        sortUsingSelection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortUsingSelection(int[] arr){
        for(int i=0; i<arr.length; i++){
            int end = arr.length - i -1;
            int max = findMaxIndex(arr,0,end);
            swap(arr,max,end);
        }
    }

    static int findMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[i]>arr[max]){
               max=i;
            }
        }
        return max;
    }

    static void swap(int[] arr , int max, int end){
        int temp = arr[max];
        arr[max] = arr[end];
        arr[end] = temp;
    }
}
