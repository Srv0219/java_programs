package com.java.srv.leetcode;

public class StringToIntegerAtoi {
    public static void main(String[] args) {
       String s = "  nZHVC jh, -42";
       myAtoi(s);
    }

    private static int myAtoi(String s) {
        s = s.replaceAll("\\s+","");
        s=s.trim();
        if (s.length()<0){
            return 0;
        }
        else if(s.charAt(0)=='-'){

        }
        for (int i=0;i<s.length();i++){
            if (s.startsWith("\\d",0)){
                return 0;
            }
        }
return 0;
    }
}
