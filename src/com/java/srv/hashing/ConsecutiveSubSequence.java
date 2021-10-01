package com.java.srv.hashing;

public class ConsecutiveSubSequence {
    public static void main(String[] args) {
        int[] a = {3, 10, 3, 11, 4, 5, 6, 7, 8, 12 , 13 , 14 ,15 ,16 ,17 ,18};
        subSequence(a);
    }

    private static void subSequence(int[] a) {
        int str=0;
        int val=0;
        for (int i=0;i< a.length;i++){
            val =a[i]+1;
            for (int j=i+1;j< a.length;j++){
                if(a[j]==val){
                    System.out.println(a[j]);
                    val++;
                }
            }
            break;
        }
    }
}
