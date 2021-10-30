package com.java.srv.fourFifty.Matrix;

import java.util.HashMap;
import java.util.Map;

public class CommonElementsInAllRows {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 1, 4, 8},
                {3, 7, 8, 5, 1},
                {8, 7, 7, 3, 1},
                {8, 1, 2, 7, 9},
        };

        printCommonElements(arr);
    }

    private static void printCommonElements(int[][] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr[0].length; i++) {
            hm.put(arr[0][i], 1);
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j=0;j< arr[0].length;j++) {
                int val = arr[i][j];
                if (hm.get(val)!= null && hm.get(val) == i) {
                    hm.put(val, hm.get(val) + 1);
                }

            }
        }
        for(Map.Entry<Integer , Integer> set: hm.entrySet()){

            if(set.getValue()> arr.length-1){
                System.out.println(set.getKey());
            }

        }
    }
}
