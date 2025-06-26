package com.naveenchandradsa.SubSequenceAndSubSet;

import java.util.ArrayList;

public class SubSequenceASCII {
    public static void main(String[] args) {
        System.out.println(subSeqASCIIRet("","abc"));
        subSeqASCII("","abc");
    }

    static void subSeqASCII(String p, String up){
        if(up.length() == 0){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeqASCII(p + ch, up.substring(1));
        subSeqASCII(p, up.substring(1));
        subSeqASCII(p  + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subSeqASCIIRet(String p, String up){
        if(up.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subSeqASCIIRet(p + ch, up.substring(1));
        ArrayList<String> second = subSeqASCIIRet(p, up.substring(1));
        ArrayList<String> third = subSeqASCIIRet(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
