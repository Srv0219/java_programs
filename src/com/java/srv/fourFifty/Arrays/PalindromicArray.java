package com.java.srv.fourFifty.Arrays;

public class PalindromicArray {
    public static void main(String[] args) {
        int arr[] = {111, 222, 333, 444, 555};

        palindromicArr(arr);
    }

    private static int palindromicArr(int[] arr) {
        int str;
        int a;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            str = arr[i];
            while (str != 0) {
                a = str % 10;
                str = str / 10;
                c = c * 10 + a;
            }
            if (c != arr[i]) {
                return 0;
            }
            c = 0;
        }
        return 1;
    }
}
