package com.naveenchandradsa;

public class FibonacciRecursion {
    public static void main(String[] args){
        int n = 14;
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
