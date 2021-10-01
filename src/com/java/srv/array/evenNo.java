package com.java.srv.array;

public class evenNo {
    public static void main(String[] args) {
        int a = 12345;
        int b;
        int c = 0;

        while (a != 0) {
            b = a % 10;
            a = a / 10;
            c = b;
            if(c%2==1){
                System.out.println(c);
            }

        }

    }

}
