package com.naveenchandradsa;

import java.util.ArrayList;

public class RecursionLinearSearch {
    public static void main(String[] args) {
        int[] arr = {7,8,9,2,6,0,3,4,4,6};
        System.out.println(search(arr, 4, 0));
        System.out.println(searchIndex(arr, 4, 0));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(searchAllIndex(arr, 4, 0, list));
    }

    static ArrayList<Integer> searchAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index > arr.length - 1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return searchAllIndex(arr, target, index+1, list);
    }

    static boolean search(int[] arr, int target, int index){
        if(index > arr.length - 1){
            return false;
        }

        return arr[index] == target || search(arr, target, index + 1);
    }

    static int searchIndex(int[] arr, int target, int index){
        if(index > arr.length - 1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return searchIndex(arr, target, index + 1);
    }
}
