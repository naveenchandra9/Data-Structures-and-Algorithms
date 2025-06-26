package com.naveenchandradsa;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 8, 0, 7};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){ // base condition, size of array 1 is already sorted
            return arr;
        }
        int mid = arr.length/2; // splitting array into two halves

        int[] first = mergeSort(Arrays.copyOfRange(arr, 0, mid)); //first half
        int[] second = mergeSort(Arrays.copyOfRange(arr, mid, arr.length)); //second half

        return merge(first, second); //function to merge sorted halves.
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length]; //creating new array of size first and second array combined
        int i = 0; //pointer for first array
        int j = 0; //pointer for second array
        int k = 0; //pointer for new array

        while(i<first.length && j<second.length){ //loop till any one array pointer crosses its length
            if(first[i] < second[j]){ //compare between element at first array and second array
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // any one of below while loop will be executed
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
