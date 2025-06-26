package com.naveenchandradsa;

import java.util.Arrays;

public class RecursionSelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,8,9,2,4,0,3,-1};
//        selectionSort1(arr, 0, arr.length - 1);
        selectionSort2(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort1(int[] arr, int start, int end){
        if(end == 0){
            return;
        }
        if(end > 0){
            int maxi = findMaxElementIndex(arr, start, end);
            swap(arr, end, maxi);
            selectionSort1(arr, start, end - 1);
        }
    }

    public static int findMaxElementIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void selectionSort2(int[] arr, int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c<=r){
            if(arr[c] > arr[max]){
                selectionSort2(arr, r, c+1, c);
            }
            else{
                selectionSort2(arr, r, c+1, max);
            }
        }
        else{
            swap(arr, r , max);
            selectionSort2(arr, r - 1, 0, 0);
        }
    }
}
