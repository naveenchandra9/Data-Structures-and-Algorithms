package com.naveenchandradsa.SubSequenceAndSubSet;

public class SkipStringCondition {
    public static void main(String[] args) {
        String str = "bccdapplehjl";
        System.out.println(skipCondition(str));
    }

    static String skipCondition(String str){
        if(str.length() == 0){
            return str;
        }

        char ch = str.charAt(0);

        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipCondition(str.substring(3));
        }
        else{
            return ch + skipCondition(str.substring(1));
        }
    }
}
