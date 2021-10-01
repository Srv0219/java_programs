package com.java.srv.String;

public class StringRemoveSpecialChar {
    public static void main(String[] args) {
        String s ="S&o!u%r$a@v";
        String[] st =s.split("\\W");
        for (int i=0;i<st.length;i++){
            System.out.println(st[i]);
        }
    }
}
//d
//D
//w
//W