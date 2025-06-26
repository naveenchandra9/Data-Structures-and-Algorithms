package com.naveenchandradsa;

public class shadowing {
    static  int x = 10;
    public static void main(String[] args) {
        System.out.println(x);
        //shadowing of variable at line 4
        int x = 90;
        System.out.println(x);
        System.out.println(shadowing.x);
        fun();
    }

    private static void fun() {
        System.out.println(x);
    }

}
