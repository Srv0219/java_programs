package com.java.srv.arrayMatrix;

public class duplicatArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 8, 3, 4, 2, 7, 8, 8, 3};
        duplicatArraynum(a);
    }

    private static void duplicatArraynum(int[] a) {
        int[] arr = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                }
//               if(i!=j){

//
//               }
            }
        }

    }
}
