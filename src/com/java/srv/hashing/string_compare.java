package com.java.srv.hashing;

public class string_compare {
    public static void main(String[] args) {

        String st1 = "Saurav";
        String st2 = "Saurav";
        String st3 = "Saurav";
        String st4 = "Saurav";
        st1.hashCode();

        if (st1 == st2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (st1 == st3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (st3 == st4) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        if (st1.equals(st2)) {
            st1.hashCode();
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (st3.equals(st4)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}



