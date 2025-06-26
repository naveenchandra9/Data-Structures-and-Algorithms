package com.naveenchandradsa.SubSequenceAndSubSet;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String s = "abc";
//        permutationSeq("",s);
        ArrayList<String> ans = permutationSeqRet("",s);
        System.out.println(ans);
    }

    static void permutationSeq(String p, String up){
        if(up.length() == 0){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0 , i);
            String second = p.substring(i , p.length());
            permutationSeq(first + ch + second, up.substring(1));
        }
    }

    static ArrayList<String> permutationSeqRet(String p, String up){
        if(up.length() == 0){
            ArrayList<String> pList = new ArrayList<>();
            pList.add(p);
            return pList;
        }

        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0 , i);
            String second = p.substring(i , p.length());
            ans.addAll(permutationSeqRet(first + ch + second, up.substring(1)));
        }
        return ans;
    }
}
