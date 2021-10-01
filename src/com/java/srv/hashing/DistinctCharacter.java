package com.java.srv.hashing;

import java.util.HashSet;

public class DistinctCharacter {
    public static void main(String[] args) {
         String st="abcabc";
         distinctChar(st);
    }

    private static void distinctChar(String st) {
        String newString = "";
        HashSet<Character> hs=new HashSet<>();
        for (int i=0;i<st.length();i++) {
            char val = st.charAt(i) ;
            if(hs.contains(val)== false) {
                hs.add(st.charAt(i));
                newString = newString+val;
            }

        }

        generateSelection(newString,0,  0, 2, "");



    }

    public static void generateSelection( String newString,int i,int ssf,int ts,String utsf){

        if (i==newString.length()){
            if(ssf== ts){
                System.out.println(utsf);
            }
            return;
        }

        char ch = newString.charAt(i);
        generateSelection( newString,i+1, ssf+1, ts, utsf+ch);
        generateSelection( newString,i+1, ssf, ts, utsf+"-");

    }
}
