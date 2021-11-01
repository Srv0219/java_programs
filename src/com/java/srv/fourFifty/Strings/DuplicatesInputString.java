package com.java.srv.fourFifty.Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInputString {
    public static void main(String[] args) {
        String s="geeksforgeeks";

        duplicates(s);
    }

    private static void duplicates(String s) {
        Map<Character,Integer> hm = new HashMap<>();

        for (int i=0;i<s.length();i++){
            if (hm.get(s.charAt(i))==null){
                hm.put(s.charAt(i),1);
            }else {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }
        for (Map.Entry<Character,Integer> set : hm.entrySet()){
            if (set.getValue()>1){
                System.out.println("count['"+set.getKey() + "']" +" = "+set.getValue());
            }
        }
    }
}
