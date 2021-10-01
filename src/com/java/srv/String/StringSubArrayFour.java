package com.java.srv.String;

public class StringSubArrayFour {
    public static void main(String[] args) {
        String s ="by42r94y101f4308u";
        String[] st =s.split("");
       // System.out.println(s.indexOf('4'));
        for (int i=s.indexOf('4');i<=s.lastIndexOf('4');i++){
            System.out.print(s.charAt(i)+" ");

           }
        }
    }

