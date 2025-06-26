package com.naveenchandradsa;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args){
        int[] arr = {-89, -10, -111, 4, -9, 7, 8, 10, 30};
        sortUsingBubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortUsingBubble(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean isSwapped = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) break;
        }
    }
}
