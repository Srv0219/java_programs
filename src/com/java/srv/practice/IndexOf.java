package com.java.srv.practice;

import java.util.Arrays;

public class IndexOf {
    public static void main(String[] args) {
        String[] arr = {"Hello", "planet" ,"earth", "you", "are", "a", "great","planet"};

            // Initialising String
            String gfg = "Welcome to geeksforgeeks";

            System.out.println(gfg.indexOf('g', 13));
            String st = "2.00";
             int ind= st.indexOf("2");
        System.out.println(st.substring(0,ind+1));

    }
}
