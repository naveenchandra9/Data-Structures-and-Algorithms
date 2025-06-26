package com.naveenchandradsa;

import java.util.Arrays;

public class RecursionBubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1};
        sortUsingBubble(arr,arr.length - 1,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortUsingBubble(int[] arr,int i, int j){
        if(i==0){
            return;
        }
        if(j<i){
            if(arr[j] > arr[j+1]){
                swap(arr, j, j+1);
            }
            sortUsingBubble(arr, i, j+1);
        }
        else{
            sortUsingBubble(arr, i-1, 0);
        }
    }

    public static void swap(int[] arr, int index, int index1){
        int temp = arr[index];
        arr[index] = arr[index1];
        arr[index1] = temp;
    }
}


