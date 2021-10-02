package com.java.srv.fourFifty;

public class NegativeElementLeftTwo {
    public static void main(String[] args) {
    int arr[]={10, -12, 11, -1, -13, -5, 6, -7, 5, 17, -21, 22, -3, -6};
        leftShift(arr);
    }

    private static void leftShift(int[] arr) {


        int j = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

}
