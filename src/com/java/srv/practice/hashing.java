package com.java.srv.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class hashing {
    public static void main(String[] args) {
        int[] arr = { 10, 34, 5, 10, 3, 5, 10 };
        hashTable();
        hashMap(arr);
        hashSet(arr);
        linkHashMap();
    }

    private static void linkHashMap() {
        LinkedHashMap<Integer,String> lhm1=new LinkedHashMap<>();
        lhm1.put(8,"India");
        lhm1.put(2,"Austrilia");
        lhm1.put(4,"England");

        System.out.println("----------lhm---------");
        System.out.println(lhm1.keySet());
        System.out.println(lhm1.values());
        System.out.println(lhm1);
        System.out.println(lhm1.entrySet());
        System.out.println(lhm1.hashCode());
    }

    private static void hashSet(int[] arr) {
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i< arr.length;i++){
           hs.add(arr[i]);
        }
        System.out.println("----------hs---------");
        System.out.println(hs);
    }

    private static void hashMap(int[] arr) {
        HashMap<Integer,String> hm1=new HashMap<>();
        hm1.put(8,"India");
        hm1.put(2,"Austrilia");
        hm1.put(4,"England");

        System.out.println("----------hm---------");
        System.out.println(hm1.keySet());
        System.out.println(hm1.values());
        System.out.println(hm1);
    }

    private static void hashTable() {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(1,"Sourav Adak");
        ht.put(13,"Tanmay Adak");
        ht.put(24,"Jharna Adak");
        ht.put(34,"sonu Adak");
        ht.put(37,"Ananta Adak");
        System.out.println("---------ht--------");
        System.out.println(ht);
    }
}
