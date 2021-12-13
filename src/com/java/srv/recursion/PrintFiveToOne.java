package com.java.srv.recursion;

import java.util.ArrayList;
import java.util.Stack;

public class PrintFiveToOne {
    public static void main(String[] args) {

        oneToFive(5);
    }

    private static void oneToFive(int a) {
        /*if(a>0){
            System.out.println(a+" ");
            oneToFive(a-1);

        }*/
        ArrayList<Integer> st = new ArrayList<>();
        if (a==0){
            return;
        }
        System.out.println(a);
        st.add(a);
        oneToFive(a-1);
        System.out.println(a);




    }
}