package com.java.srv.fourFifty.Arrays;

import java.util.HashSet;

public class ArraySubsetOfAnotherArray2 {
    public static void main(String[] args) {
        long a1[] = {1, 2, 3, 4, 5, 6};
        long a2[] = {1, 2, 4};

        subsetOfAnotherArray(a1, a2);
    }

    private static String subsetOfAnotherArray(long[] a1, long[] a2) {
        int count=0;
        String str;
        HashSet<Long>hs = new HashSet<>();
        for (int i=0;i< a1.length;i++){
            hs.add(a1[i]);
        }
        for (int j=0;j< a2.length;j++){
            if (hs.contains(a2[j])){
                count++;
            }
        }
        if (count== a2.length){
            str= "Yes";
        }else {
            str="No";
        }
        System.out.println(str);
        return str;
    }
}
