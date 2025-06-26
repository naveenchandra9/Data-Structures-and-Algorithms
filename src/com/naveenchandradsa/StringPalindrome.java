package com.naveenchandradsa;

public class StringPalindrome {
    public static void main(String[] args){
        String str = "Naveevan";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        if(str.length() == 0 || str == null){
            return true;
        }
        for(int i=0; i<=str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
