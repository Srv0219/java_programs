
package com.java.srv.String;
import java.util.ArrayList;

public class SumOfSubSet {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int i = 0;
        int val1 = 0;
        int val2 = 0;

        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();

        tugWarSol(arr, i, set1, set2, val1, val2);
    }

    private static void tugWarSol(int[] arr, int i, ArrayList<Integer> set1, ArrayList<Integer> set2, int val1, int val2) {

        if (i == arr.length) {
            if (val1 == 60) {
                System.out.println("----------");
                System.out.println(set1);
                //System.out.println(set2);
                System.out.println("----------");

            }
            return;
        }
       // if (set1.size() < arr.length) {
           set1.add(arr[i]);
            tugWarSol(arr, i + 1, set1, set2, val1 + arr[i], val2);
            set1.remove(set1.size() - 1);
      //  }

            set2.add(arr[i]);
            tugWarSol(arr, i + 1, set1, set2, val1, val2+arr[i] );
            set2.remove(set2.size() - 1);

    }
}

