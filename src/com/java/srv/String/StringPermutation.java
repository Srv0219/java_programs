package com.java.srv.String;

import java.util.ArrayList;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "ABC";
        permutationString(str,"");

    }

    private static void permutationString(String str, String s) {

        ArrayList<String> al = new ArrayList<>();
        for (int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            String res=str.substring(0,i)+str.substring(i+1);
            System.out.println(ch+res);
            permutationString(res,s+ch);


        }





    }
}
