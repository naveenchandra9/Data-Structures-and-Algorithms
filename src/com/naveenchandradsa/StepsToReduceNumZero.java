package com.naveenchandradsa;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class StepsToReduceNumZero {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(stepCounter(num, 0));
    }

    static int stepCounter(int num, int count){
        if(num == 0){
            return count;
        }
        if(num%2 == 0){
            return stepCounter(num/2, ++count);
        }
        else {
            return stepCounter(num - 1, ++count);
        }
    }
}
