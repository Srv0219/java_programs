package com.java.srv.fourFifty.Matrix;

import java.util.ArrayList;

public class MaxRectangle {
    public static void main(String[] args) {
        int M[][] = {{0, 1, 1, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0}};
        maxRectangle(M);
    }

    private static int maxRectangle(int[][] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        int mul = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            al.add(count);
            count = 0;
        }
        count = 1;
        for (int i= 1;i<al.size();i++) {
            if (al.get(i) == al.get(i-1)) {
                count = count + 1;
                mul = al.get(i);
            }
        }
        System.out.println(mul * count);
        return mul * count;
    }
}
