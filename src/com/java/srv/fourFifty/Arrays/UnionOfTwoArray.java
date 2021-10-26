package com.java.srv.fourFifty.Arrays;

import java.util.HashSet;

public class UnionOfTwoArray {
    public static void main(String[] args) {
       int n= 6,m= 2;
        int a[] = {85, 25, 1, 32, 54, 6};
        int b[] = {85,2};
       doUnion(a,n,b,m);
    }
    public static int doUnion(int a[], int n, int b[], int m)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(a[i]);
        }
        for(int i=0;i<m;i++){
            hs.add(b[i]);
        }
        System.out.println(hs.size());
        return hs.size();
    }
}
