package com.java.srv.String;

public class StringChar {
    public static void main(String[] args) {
        String s="Sourav";
        for (int i=0;i<s.length();i++){
            char val=s.charAt(i);
            System.out.println(i+" - "+val);

        }
    }
}
