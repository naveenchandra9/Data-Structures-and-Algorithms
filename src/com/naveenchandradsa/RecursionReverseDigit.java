package com.naveenchandradsa;

public class RecursionReverseDigit {
    public static void main(String[] args) {
        int num = 1234;
        int digit = (int)(Math.log10(num)) + 1;
        System.out.println(reverseNumber(num, digit));
    }

    static int reverseNumber(int num, int digit){
        if(num%10 == num){
            return num;
        }

        int rem = num%10;
        return rem*(int)(Math.pow(10,digit - 1)) + reverseNumber(num/10, digit - 1);
    }
}
