package com.java.srv.hashing;

import java.util.HashMap;
import java.util.Map;

public class disjoint {
    public static void main(String[] args) {
       int[] set1 = {12, 34, 11, 9 , 3 , 3};
       int[] set2 = {2, 1, 1, 5};

       disjointSet(set1,set2);
    }

    private static void disjointSet(int[] set1, int[] set2) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        for (int i=0;i<set1.length;i++){
             if (hm.get(set1[i])== null) {
                 hm.put(set1[i],1);
             }
             else{
                 int count =hm.get(set1[i]);
                 hm.put(set1[i],count+1);
             }

        }
        for (int i=0;i<set2.length;i++){
            if (hm.get(set2[i])== null) {
                hm.put(set2[i],1);
            }
            else{
                int count =hm.get(set2[i]);
                hm.put(set2[i],count+1);
            }

        }
        for (Map.Entry<Integer,Integer> set : hm.entrySet()){
            if (set.getValue()>1){
                System.out.println("Not disjoint");
            }
        }

    }
}
