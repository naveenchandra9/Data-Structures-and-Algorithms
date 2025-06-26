package com.naveenchandradsa;

public class CountZeroes {
    public static void main(String[] args) {
        int n = 30204;
        System.out.println(countZeroes(n, 0));
    }

    static int countZeroes(int n, int count){
        if(n%10 == 0){
            count++;
        }
        if(n%10 == n){
            return count;
        }
        return countZeroes(n/10, count);
    }
}
