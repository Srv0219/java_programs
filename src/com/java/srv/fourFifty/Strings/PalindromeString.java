package com.java.srv.fourFifty.Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "abc";

        isPalindrome(s);
    }

    private static int isPalindrome(String s) {
        int j=0;
        for (int i=s.length()-1;i>=0;i--){
            if (s.charAt(i)!=s.charAt(j)){
                return 0;
            }
            j++;
        }
        return 1;
    }
}
