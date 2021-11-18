package com.java.srv.DynamicProgramming;

public class PaintFence {
    public static void main(String[] args) {
        int n = 8;
        int k = 3;

        paintFence(n, k);
    }

    private static void paintFence(int n, int k) {
        int ii = 0;
        int ij = 0;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i == 1){
                ii = k;
                ij = ii * (k - 1);
                sum = ii + ij;
            }else {
                ii = ij;
                ij = sum * (k - 1);
                sum = ii + ij;
            }
        }
        System.out.println(sum);
    }
}
