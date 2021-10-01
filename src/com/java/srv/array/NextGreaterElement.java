package com.java.srv.array;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 30, 5, 2, 25};
        greaterElement(arr);
    }

    private static void greaterElement(int[] arr) {
        boolean[] visit = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j] && visit[j] == false) {
                    System.out.println(arr[i] + "-" + arr[j]);
                    visit[i] = true;
                    break;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (visit[k] == false) {
                System.out.println(arr[k] + ":" + -1);
            }

        }
    }
}
