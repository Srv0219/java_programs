package com.java.srv.practice;

public class Main {

        public static void main(String[] args) {
            int x =81;
            int j=0;
            int y =squareRoot(x,j);
            System.out.println(y);
        }

        public static int squareRoot(int x,int j) {
            int st;
            for (int i = 0; i < 10; i++) {
                st = i * i;

                if (st == x) {
                 j=i;
                }

            }
            return j;
        }

    }
