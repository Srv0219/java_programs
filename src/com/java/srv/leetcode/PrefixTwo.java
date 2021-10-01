package com.java.srv.leetcode;


import java.util.HashMap;
import java.util.Map;

public class PrefixTwo {
    public static void main(String[] args) {
        String[] strs = {"aa","aa"};
        //"dog","racecar","car"
        //"flower","flow","flight"
        //"aa","aa"
        //"cir","car"
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        String str = "";
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }


        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < min; j++) {
                if (hm.get(strs[i].charAt(j)) == null) {
                    hm.put(strs[i].charAt(j), 1);
                } else {
                    hm.put(strs[i].charAt(j), hm.get(strs[i].charAt(j)) + 1);
                }
            }
        }

//        for (Map.Entry<Character, Integer> set : hm.entrySet()) {
        for (int i = 0; i < min; i++) {
            if (hm.containsKey(strs[0].charAt(i)) && hm.get(strs[0].charAt(i)) == strs.length) {
                str = str + strs[0].charAt(i);
            } else {
                break;
            }
        }
        //  }


        return str;
    }
}