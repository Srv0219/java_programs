package com.java.srv.recursion;

public class ThreeRecursive {
    public static void main(String[] args) {
        three(3);
    }

    private static void three(int i) {
        if (i==0){
            return;
        }
        System.out.println("pre " + i);
        three(i-1);
        System.out.println("in " + i);
        three(i-1);
        System.out.println("post " + i);

    }
}
