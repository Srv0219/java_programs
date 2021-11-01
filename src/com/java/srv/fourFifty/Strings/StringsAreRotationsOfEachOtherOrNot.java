package com.java.srv.fourFifty.Strings;

public class StringsAreRotationsOfEachOtherOrNot {
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="ACBD";

        areRotations(str1, str2);
    }

    private static void areRotations(String str1, String str2) {

        String temp=str1+str1;
        if (str1.length()==str2.length() && temp.indexOf(str2)!=-1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
