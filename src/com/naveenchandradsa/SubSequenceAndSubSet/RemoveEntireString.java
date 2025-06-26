package com.naveenchandradsa.SubSequenceAndSubSet;

public class RemoveEntireString {
    public static void main(String[] args) {
        System.out.println(skipString("bcappledghdg"));
    }
    static String skipString(String up){
        if(up.length() == 0){
            return "";
        }
        if(up.startsWith("apple")){
            return skipString(up.substring(5));
        }
        else{
            return up.charAt(0) + skipString(up.substring(1));
        }
    }
}
