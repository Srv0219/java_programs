package com.java.srv.array;

public class ConcatTwoArray {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int b[] ={6,7,8,9,0};
        int length=a.length+ b.length;
        int c[] = new int[length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        for (int i=0;i< c.length;i++){
            System.out.println(c[i]);
        }

    }
}
