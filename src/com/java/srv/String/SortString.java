package com.java.srv.String;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String st ="uvysivgayuarg";
        char[] sort = st.toCharArray();
        Arrays.sort(sort);
        System.out.println(sort);
    }
}
