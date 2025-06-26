package com.naveenchandradsa;

public class countDigits {
    public static void main(String[] args) {
        int num = 576576;
        int digit = (int)Math.log10(num) + 1;
        System.out.println(digit);
    }
}
