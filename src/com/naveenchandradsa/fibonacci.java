package com.naveenchandradsa;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        int i=1;
        if(n==1){
            System.out.println(p);
        } else if (n==2) System.out.println(i);
        else {
            int count = 2;
            while (count <= n) {
                int temp = i;
                i = i + p;
                p = temp;
                count++;
            }
            System.out.println(i);
        }
    }
}