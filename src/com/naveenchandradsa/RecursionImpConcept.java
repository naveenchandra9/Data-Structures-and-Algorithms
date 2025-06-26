package com.naveenchandradsa;

public class RecursionImpConcept {
    public static void main(String[] args) {
        int n = 5;
        concept(n);
    }

    static void concept(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        //n-- vs --n
        //concept(n--);
        concept(--n);
    }
}
