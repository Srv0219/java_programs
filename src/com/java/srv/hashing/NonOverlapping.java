package com.java.srv.hashing;

import java.util.HashMap;
import java.util.Map;

public class NonOverlapping {
    public static void main(String[] args) {
      int[] a = {1, 5, 3, 8};
      int[] b = {5, 4, 6, 7};

        nonOverlapping(a,b);
    }

    private static void nonOverlapping(int[] a, int[] b) {

        HashMap<Integer,Integer> hs=new HashMap<>();
        for (int i=0;i< a.length;i++){
            hs.put(a[i], hs.getOrDefault(a[i],0)+1);
        }
        for (int i=0;i< b.length;i++){
            hs.put(b[i], hs.getOrDefault(b[i],0)+1);
        }

       // System.out.println(hs);
        int add=0;
        for (Map.Entry<Integer,Integer> set :hs.entrySet()){

            if(set.getValue()<2){
                add= add+set.getKey();
                System.out.print(set.getKey()+" + " );
            }
        }
        System.out.println("ans : "+add);

    }
}
