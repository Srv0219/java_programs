package com.java.srv.functionsRegx;

public class findNoFromString {
    public static void main(String[] args) {
        String num = "ab1cc23de7";
        findNumber(num);
    }

    private static void findNumber( String num) {

        String[] st = num.split("\\D");
        for (int i = 0; i<st.length;i++){
            System.out.print(st[i]);
        }

    }
}
