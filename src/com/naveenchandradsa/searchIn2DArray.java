package com.naveenchandradsa;

import java.util.Arrays;
import java.util.Scanner;

public class searchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = {
                {7,8,9},
                {2,6,0},
                {3,4,4,6}
        };
        int target = sc.nextInt();
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println(Arrays.toString(max(arr)));
    }

    public static int[] max(int[][] arr){
        int m = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] > m){
                    m = arr[i][j];
                }
            }
        }
        return new int[]{m};
    }

    public static int[] search(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
