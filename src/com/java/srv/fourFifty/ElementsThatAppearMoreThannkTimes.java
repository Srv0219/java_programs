package com.java.srv.fourFifty;

import java.util.Map;
import java.util.TreeMap;

public class ElementsThatAppearMoreThannkTimes {
    static void printElements(int arr[], int n, int k) {


        int x = n / k;


        TreeMap<Integer, Integer> mp = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++)
            mp.put(arr[i],
                    mp.getOrDefault(arr[i], 0) + 1);

        for (Map.Entry m : mp.entrySet()) {
            if ((int) m.getValue() > x)
                System.out.println(m.getKey());
        }
    }


    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 3, 3, 3, 5, 4, 2, 2,2, 3, 1, 1, 1};
        int n = arr.length;
        int k = 4;

        printElements(arr, n, k);

    }
}
