package com.naveenchandradsa;

public class RecursionSumOfDigits {
    public static void main(String[] args) {
        int digit = 1342;
        System.out.println(sum(digit));
    }

    static int sum(int digit){
        if(digit/10 == 0){
            return digit;
        }

        return digit%10 + sum(digit/10);
    }
}
