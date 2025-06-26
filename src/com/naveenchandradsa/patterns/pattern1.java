package com.naveenchandradsa.patterns;

public class pattern1 {
    public static void main(String[] args) {
//        pattern1(3,0);
        pattern1reverse(3,0);
    }

    static void pattern1(int r, int c){
        if(r == 0){
            return;
        }
        if(c<r){
            System.out.print("*");
            pattern1(r,c+1);
        }
        else{
            System.out.println();
            pattern1(r-1, 0);
        }
    }

    static void pattern1reverse(int r, int c){
        if(r == 0){
            return;
        }
        if(c<r){
            pattern1reverse(r,c+1);
            System.out.print("*");
                    }
        else{
            pattern1reverse(r-1, 0);
            System.out.println();
        }
    }
}
