package com.java.srv.fourFifty.Arrays;

public class ArraySubsetOfAnotherArray {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5, 6};
        int a2[] = {1, 2, 4,8};

        subsetOfAnotherArray(a1,a2);
    }

    private static void subsetOfAnotherArray(int[] a1, int[] a2) {
        int count=0;
        for (int i=0;i<a2.length;i++){
            for (int j=0;j<a1.length;j++){
                if (a2[i]==a1[j] && count<=a2.length){
                    count++;
                    break;
                }
            }
        }
        if (count== a2.length){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

    }
}
