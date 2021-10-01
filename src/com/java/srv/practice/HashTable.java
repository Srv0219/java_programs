package com.java.srv.practice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        ht.put(1,10);
        ht.put(2,20);
        ht.put(3,30);
        ht.put(4,40);
        ht.put(1,50);
        ht.put(5,60);
        ht.put(4,70);
        System.out.println(" hash Table "+ ht);

        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1,10);
        hm.put(5,20);
        hm.put(3,30);
        hm.put(4,40);
        hm.put(1,50);
        hm.put(2,60);
        hm.put(4,70);
        System.out.println("hash Map "+hm);

        LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
        lhm.put(1,10);
        lhm.put(5,20);
        lhm.put(3,30);
        lhm.put(4,40);
        lhm.put(1,50);
        lhm.put(2,60);
        lhm.put(4,70);
        System.out.println("Linked hash Map "+lhm);
    }
}
