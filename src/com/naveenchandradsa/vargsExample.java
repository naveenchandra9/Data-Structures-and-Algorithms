package com.naveenchandradsa;

import java.util.Arrays;

public class vargsExample {
    public static void main(String[] args) {
        fun(3,4,5,6,7,8,9,10);
        funString("Naveenchandra","Arunchandra");
    }
    static void fun (int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void funString(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
