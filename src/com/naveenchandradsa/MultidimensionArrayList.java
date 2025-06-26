package com.naveenchandradsa;

import java.util.ArrayList;
import java.util.Scanner;

public class MultidimensionArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(3);
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>(3));
            for(int j=0; j<3; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        list.get(2).set(1,9);
        System.out.println(list);
//        int[][] arr = new int[5][3];
//        for(int i=0; i<5; i++){
//            for(int j=0; j<3; j++){
//                arr[i][j]=1;
//            }
//        }
//        for(int i=0; i<5; i++){
//            for(int j=0; j<3; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
