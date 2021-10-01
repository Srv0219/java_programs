package com.java.srv.practice;

public class Recursion {
    public static void main(String[] args) {
        System.out.println( recursionJava(5));

        System.out.println( recursionJava(5,10));
    }

    private static int recursionJava(int i) {

            if (i==1){
                return 1;
            }
            return i+recursionJava(i-1);
        }

    private static int recursionJava(int a,int b) {

//        if (b==0){
//            return 1;
//        }
//        return a * recursionJava(a,b-1);

        if(b>a){
            System.out.println(b);
            return b + recursionJava(a,b-1);

        }
        return b;
    }

    }

