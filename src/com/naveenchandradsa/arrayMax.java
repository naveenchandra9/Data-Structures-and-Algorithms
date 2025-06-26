package com.naveenchandradsa;

public class arrayMax {
    public static void main(String[] args){
        int[] arr = {7,8,9,2,6,50,10};
        System.out.println(maxRange(arr,0,3));
    }
    static int maxRange(int[] arr, int start, int end){
        int max = Integer.MIN_VALUE;
        for(int i=start; i<=end; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int maxRange(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
