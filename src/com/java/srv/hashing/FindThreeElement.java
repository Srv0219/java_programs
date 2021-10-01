package com.java.srv.hashing;

import java.util.HashSet;

public class FindThreeElement {
    public static void main(String[] args) {
        int[] a1 = { 1 , 2 , 3 , 4 , 5 };
        int[] a2 = { 2 , 3 , 6 , 1 , 2 };
        int[] a3 = { 3 , 2 , 4 , 5 , 6 };
        int num=9;
        sumFromGivenArray(a1,a2,a3,num);
    }

    private static void sumFromGivenArray(int[] a1, int[] a2, int[] a3,int num) {
       int sum=0;
     /*   for (int i=0;i< a1.length;i++){
            int str1=a1[i];
            for (int j=0;j< a2.length;j++){
                int str2=a2[j];
                for (int k=0;k<a3.length;k++){
                    int str3=a3[k];
                    sum=a1[i]+a2[j]+a3[k];
                    if (sum==num){
                        System.out.println(a1[i]+" "+a2[j]+" "+a3[k] +" = "+sum);
                        return;
                    }

                }
            }*/
        HashSet<Integer> hs = new HashSet<Integer>();
       // int i = 0 ;
        for(int i : a1){
            hs.add(i);
        }

        for (int j=0;j< a2.length;j++){
            int str2=a2[j];
            for (int k=0;k<a3.length;k++){
                int str3=a3[k];
                int val = num-(a2[j]+a3[k]);
                if (hs.contains(val)){
                    System.out.println(val + " "+a2[j]+" "+a3[k]);

                }else
                    hs.add(val);

            }

        }
    }
}
