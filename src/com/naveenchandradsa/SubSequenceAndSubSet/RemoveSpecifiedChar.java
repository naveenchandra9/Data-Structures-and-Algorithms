package com.naveenchandradsa.SubSequenceAndSubSet;

public class RemoveSpecifiedChar {
    public static void main(String[] args) {
        skip("","baccabacci");
        System.out.println(skip3("","baccabacciah"));
    }

    static void skip(String p, String up){
        if(up.length() == 0){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p + ch, up.substring(1));
        }
    }

    static String skip1(String up){
        if(up.length() == 0){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip1(up.substring(1));
        }
        else{
            return ch + skip1(up.substring(1));
        }
    }

    static String skip3(String ans, String str){
        if(str == ""){
            return ans;
        }

        char ch = str.charAt(0);

        if(ch == 'a'){
            return skip3(ans, str.substring(1));
        }

        ans = ans + ch;
        return skip3(ans, str.substring(1));
    }
}
