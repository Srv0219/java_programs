package com.java.srv.leetcode;

public class FindDifference {
    public static void main(String[] args) {
        String s = "";
        String t = "a";
        findTheDifference(s, t);
    }

    public static char findTheDifference(String s, String t) {
        char ch = 0;
        if (s.length() == 0 && t.length() == 0 || s.length() == 0 && t.length()>1 ||s.length() > 1 && t.length() == 0) {
           if (t.length()>1){
               for (int i=0;i<t.length();i++){
                   ch = (char) (ch+t.charAt(i));
               }
           }
           else {
               for (int i=0;i<s.length();i++){
                   ch = (char) (ch+s.charAt(i));
               }
           }
           return ch;
        }
        else {
            int i =0;
           while (s.length()!=t.length()){

               if (s.charAt(i)!=t.charAt(i)){

               }
               i++;

           }
        }
        return ch;
    }
}
